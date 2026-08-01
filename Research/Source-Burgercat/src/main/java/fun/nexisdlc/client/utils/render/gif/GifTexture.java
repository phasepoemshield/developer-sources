package fun.nexisdlc.client.utils.render.gif;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.utils.render.easy.TextureRenderer;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import org.joml.Vector4f;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.List;

public final class GifTexture {
    private static final int DEFAULT_FRAME_MS = 100;
    private static final Map<Identifier, GifTexture> CACHE = new HashMap<>();
    private static final java.util.Set<Identifier> PENDING =
            java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap<>());

    private final Identifier gifId;
    private final Identifier[] frameIds;
    private final long[] frameDurationsNs;
    private final long totalDurationNs;

    private int frameIndex;
    private long accumulatedNs;
    private long lastUpdateNs;

    private GifTexture(Identifier gifId, Identifier[] frameIds, long[] frameDurationsNs) {
        this.gifId = gifId;
        this.frameIds = frameIds;
        this.frameDurationsNs = frameDurationsNs;
        long total = 0L;
        for (long duration : frameDurationsNs) {
            total += Math.max(1_000_000L, duration);
        }
        this.totalDurationNs = total;
    }

    public static GifTexture getOrLoad(Identifier gifId) {
        GifTexture cached = CACHE.get(gifId);
        if (cached != null) {
            return cached;
        }
        queueLoad(gifId);
        return null;
    }

    public static GifTexture getCached(Identifier gifId) {
        return CACHE.get(gifId);
    }

    public static void queueLoad(Identifier gifId) {
        if (gifId == null || CACHE.containsKey(gifId)) {
            return;
        }
        PENDING.add(gifId);
    }

    public static void preloadQueued() {
        if (PENDING.isEmpty()) {
            return;
        }
        var queued = new ArrayList<>(PENDING);
        PENDING.clear();
        Renderer2D renderer = null;
        renderer = NexisClient.getRenderer2D();
        for (Identifier id : queued) {
            if (!CACHE.containsKey(id)) {
                GifTexture created = load(id);
                CACHE.put(id, created);
                if (renderer != null) {
                    for (Identifier frameId : created.getFrameIds()) {
                        renderer.preloadTexture(frameId);
                    }
                }
            }
        }
    }

    public static GifTexture load(Identifier gifId) {
        if (gifId == null) {
            return new GifTexture(null, new Identifier[0], new long[0]);
        }

        List<Identifier> frames = new ArrayList<>();
        List<Long> durationsNs = new ArrayList<>();

        String baseName = gifId.getPath()
                .replace('/', '_')
                .replace('.', '_');

        try (InputStream input = openGifResource(gifId);
             ImageInputStream imageInput = ImageIO.createImageInputStream(input)) {
            var readers = ImageIO.getImageReadersByFormatName("gif");
            ImageReader reader = readers.hasNext() ? readers.next() : null;
            if (reader == null) {
                return new GifTexture(gifId, new Identifier[0], new long[0]);
            }
            reader.setInput(imageInput, false, false);
            int frameCount = reader.getNumImages(true);
            Dimension canvas = readCanvasSize(reader.getStreamMetadata());
            BufferedImage master = null;
            BufferedImage restoreSnapshot = null;
            Rectangle prevRect = null;
            String prevDisposal = "none";

            for (int i = 0; i < frameCount; i++) {
                BufferedImage frame = ensureArgb(reader.read(i));
                IIOMetadata metadata = reader.getImageMetadata(i);
                GifFrameInfo frameInfo = readFrameInfo(metadata, frame);
                int delayMs = frameInfo.delayMs;
                int left = frameInfo.left;
                int top = frameInfo.top;
                int width = frameInfo.width;
                int height = frameInfo.height;

                if (master == null) {
                    int canvasW = canvas.width > 0 ? canvas.width : frame.getWidth();
                    int canvasH = canvas.height > 0 ? canvas.height : frame.getHeight();
                    master = new BufferedImage(canvasW, canvasH, BufferedImage.TYPE_INT_ARGB);
                }

                applyDisposal(master, prevDisposal, prevRect, restoreSnapshot);
                if ("restoreToPrevious".equals(frameInfo.disposal)) {
                    restoreSnapshot = copyImage(master);
                } else {
                    restoreSnapshot = null;
                }

                Graphics2D g = master.createGraphics();
                g.setComposite(AlphaComposite.SrcOver);
                g.drawImage(frame, left, top, null);
                g.dispose();

                BufferedImage composed = copyImage(master);
                Identifier frameId = Identifier.of(gifId.getNamespace(),
                        "gif/" + baseName + "_frame_" + i);
                registerFrameTexture(frameId, composed);
                frames.add(frameId);
                durationsNs.add(delayMs * 1_000_000L);

                prevRect = new Rectangle(left, top, width, height);
                prevDisposal = frameInfo.disposal;
            }
            reader.dispose();
        } catch (IOException ignored) {
        }

        Identifier[] ids = frames.toArray(new Identifier[0]);
        long[] frameDurationsNs = new long[durationsNs.size()];
        for (int i = 0; i < durationsNs.size(); i++) {
            frameDurationsNs[i] = Math.max(1_000_000L, durationsNs.get(i));
        }

        GifTexture gif = new GifTexture(gifId, ids, frameDurationsNs);
        GifManager.getInstance().register(gif);
        return gif;
    }

    public void tick() {
        advanceTime(System.nanoTime());
    }

    public Identifier[] getFrameIds() {
        if (frameIds.length == 0) {
            return new Identifier[0];
        }
        return frameIds.clone();
    }

    public Identifier getCurrentFrame() {
        if (frameIds.length == 0) {
            return null;
        }
        return frameIds[frameIndex];
    }

    public void render(float x, float y, float width, float height, Vector4f rounding, Color color) {
        advanceTime(System.nanoTime());
        Identifier frame = getCurrentFrame();
        if (frame == null) {
            return;
        }
        TextureRenderer.render(frame, x, y, width, height, rounding, color);
    }

    private void advanceTime(long nowNs) {
        if (frameIds.length == 0) {
            return;
        }
        if (lastUpdateNs == 0L) {
            lastUpdateNs = nowNs;
            return;
        }
        long deltaNs = nowNs - lastUpdateNs;
        if (deltaNs <= 0L) {
            return;
        }
        lastUpdateNs = nowNs;
        if (totalDurationNs > 0L) {
            deltaNs %= totalDurationNs;
        }
        accumulatedNs += deltaNs;
        while (accumulatedNs >= frameDurationsNs[frameIndex]) {
            accumulatedNs -= frameDurationsNs[frameIndex];
            frameIndex = (frameIndex + 1) % frameIds.length;
        }
    }

    private static InputStream openGifResource(Identifier gifId) throws IOException {
        MinecraftClient client = MinecraftClient.getInstance();
        ResourceManager manager = client != null ? client.getResourceManager() : null;

        if (manager != null) {
            Optional<Resource> resource = manager.getResource(gifId);
            if (resource.isPresent()) {
                return resource.get().getInputStream();
            }
        }

        InputStream fallback = GifTexture.class.getResourceAsStream(
                "/assets/" + gifId.getNamespace() + "/" + gifId.getPath());
        if (fallback != null) {
            return fallback;
        }

        throw new IOException("GIF resource not found: " + gifId);
    }

    private static int readDelayMs(IIOMetadata metadata) {
        if (metadata == null) {
            return DEFAULT_FRAME_MS;
        }
        Node tree = metadata.getAsTree("javax_imageio_gif_image_1.0");
        Node node = tree.getFirstChild();
        while (node != null) {
            if ("GraphicControlExtension".equals(node.getNodeName())) {
                NamedNodeMap attrs = node.getAttributes();
                Node delayNode = attrs != null ? attrs.getNamedItem("delayTime") : null;
                if (delayNode != null) {
                    try {
                        int delay = Integer.parseInt(delayNode.getNodeValue());
                        return Math.max(1, delay) * 10;
                    } catch (NumberFormatException ignored) {
                    }
                }
                break;
            }
            node = node.getNextSibling();
        }
        return DEFAULT_FRAME_MS;
    }

    private static Dimension readCanvasSize(IIOMetadata metadata) {
        if (metadata == null) {
            return new Dimension(0, 0);
        }
        Node tree = metadata.getAsTree("javax_imageio_gif_stream_1.0");
        Node node = tree.getFirstChild();
        while (node != null) {
            if ("LogicalScreenDescriptor".equals(node.getNodeName())) {
                NamedNodeMap attrs = node.getAttributes();
                int width = parseInt(attrs, "logicalScreenWidth", 0);
                int height = parseInt(attrs, "logicalScreenHeight", 0);
                return new Dimension(width, height);
            }
            node = node.getNextSibling();
        }
        return new Dimension(0, 0);
    }

    private static GifFrameInfo readFrameInfo(IIOMetadata metadata, BufferedImage frame) {
        int left = 0;
        int top = 0;
        int width = frame.getWidth();
        int height = frame.getHeight();
        int delayMs = DEFAULT_FRAME_MS;
        String disposal = "none";

        if (metadata != null) {
            Node tree = metadata.getAsTree("javax_imageio_gif_image_1.0");
            Node node = tree.getFirstChild();
            while (node != null) {
                String name = node.getNodeName();
                if ("ImageDescriptor".equals(name)) {
                    NamedNodeMap attrs = node.getAttributes();
                    left = parseInt(attrs, "imageLeftPosition", 0);
                    top = parseInt(attrs, "imageTopPosition", 0);
                    width = parseInt(attrs, "imageWidth", width);
                    height = parseInt(attrs, "imageHeight", height);
                } else if ("GraphicControlExtension".equals(name)) {
                    NamedNodeMap attrs = node.getAttributes();
                    delayMs = Math.max(1, parseInt(attrs, "delayTime", DEFAULT_FRAME_MS / 10)) * 10;
                    Node disposalNode = attrs != null ? attrs.getNamedItem("disposalMethod") : null;
                    if (disposalNode != null) {
                        disposal = disposalNode.getNodeValue();
                    }
                }
                node = node.getNextSibling();
            }
        }

        return new GifFrameInfo(left, top, width, height, delayMs, disposal);
    }

    private static int parseInt(NamedNodeMap attrs, String key, int fallback) {
        if (attrs == null) {
            return fallback;
        }
        Node node = attrs.getNamedItem(key);
        if (node == null) {
            return fallback;
        }
        try {
            return Integer.parseInt(node.getNodeValue());
        } catch (NumberFormatException ignored) {
            return fallback;
        }
    }

    private static BufferedImage ensureArgb(BufferedImage src) {
        if (src.getType() == BufferedImage.TYPE_INT_ARGB) {
            return src;
        }
        BufferedImage copy = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = copy.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.drawImage(src, 0, 0, null);
        g.dispose();
        return copy;
    }

    private static BufferedImage copyImage(BufferedImage src) {
        BufferedImage copy = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = copy.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.drawImage(src, 0, 0, null);
        g.dispose();
        return copy;
    }

    private static void applyDisposal(BufferedImage master, String disposal, Rectangle rect, BufferedImage restoreSnapshot) {
        if (master == null || rect == null || disposal == null) {
            return;
        }
        if ("restoreToBackgroundColor".equals(disposal)) {
            Graphics2D g = master.createGraphics();
            g.setComposite(AlphaComposite.Clear);
            g.fillRect(rect.x, rect.y, rect.width, rect.height);
            g.dispose();
        } else if ("restoreToPrevious".equals(disposal) && restoreSnapshot != null) {
            Graphics2D g = master.createGraphics();
            g.setComposite(AlphaComposite.Src);
            g.drawImage(restoreSnapshot, 0, 0, null);
            g.dispose();
        }
    }

    private record GifFrameInfo(int left, int top, int width, int height, int delayMs, String disposal) {
    }

    private static void registerFrameTexture(Identifier id, BufferedImage image) {
        if (image == null) {
            return;
        }
        int width = image.getWidth();
        int height = image.getHeight();
        NativeImage nativeImage = new NativeImage(width, height, true);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int argb = image.getRGB(x, y);
                int a = (argb >>> 24) & 0xFF;
                int r = (argb >>> 16) & 0xFF;
                int g = (argb >>> 8) & 0xFF;
                int b = argb & 0xFF;
                int abgr = (a << 24) | (b << 16) | (g << 8) | r;
                nativeImage.setColor(x, y, abgr);
            }
        }
        NativeImageBackedTexture texture = new NativeImageBackedTexture(id::toString, nativeImage);
        MinecraftClient.getInstance().getTextureManager().registerTexture(id, texture);
    }
}
