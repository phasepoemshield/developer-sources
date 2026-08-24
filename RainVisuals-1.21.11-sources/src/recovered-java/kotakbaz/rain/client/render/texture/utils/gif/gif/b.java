/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.utils.gif.gif;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Node;
import oxxxde.\u0635\u0623;

public class b
extends \u0635\u0623 {
    public int pixelAspectRatio;
    public int colorResolution;
    public int logicalScreenHeight;
    public byte[] globalColorTable = null;
    public String version;
    public int backgroundColorIndex;
    public int logicalScreenWidth;
    static final String nativeMetadataFormatName = "javax_imageio_gif_stream_1.0";
    static final String[] versionStrings;
    public boolean sortFlag;
    static final String[] colorTableSizes;

    /*
     * WARNING - void declaration
     */
    private Node getNativeTree() {
        void var2_1;
        IIOMetadataNode root = new IIOMetadataNode(nativeMetadataFormatName);
        IIOMetadataNode node = new IIOMetadataNode("Version");
        node.setAttribute("value", this.version);
        root.appendChild(node);
        node = new IIOMetadataNode("LogicalScreenDescriptor");
        node.setAttribute("logicalScreenWidth", this.logicalScreenWidth == -1 ? "" : Integer.toString(this.logicalScreenWidth));
        node.setAttribute("logicalScreenHeight", this.logicalScreenHeight == -1 ? "" : Integer.toString(this.logicalScreenHeight));
        node.setAttribute("colorResolution", this.colorResolution == -1 ? "" : Integer.toString(this.colorResolution));
        node.setAttribute("pixelAspectRatio", Integer.toString(this.pixelAspectRatio));
        root.appendChild(node);
        if (this.globalColorTable != null) {
            void var1_2;
            node = new IIOMetadataNode("GlobalColorTable");
            int numEntries = this.globalColorTable.length / 3;
            node.setAttribute("sizeOfGlobalColorTable", Integer.toString(numEntries));
            node.setAttribute("backgroundColorIndex", Integer.toString(this.backgroundColorIndex));
            node.setAttribute("sortFlag", this.sortFlag ? "TRUE" : "FALSE");
            int i = 0;
            while (i < numEntries) {
                void var4_4;
                void var5_5;
                IIOMetadataNode entry = new IIOMetadataNode("ColorTableEntry");
                entry.setAttribute("index", Integer.toString(i));
                int r = this.globalColorTable[3 * i] & 0xFF;
                int g = this.globalColorTable[3 * i + 1] & 0xFF;
                int b2 = this.globalColorTable[3 * i + 2] & 0xFF;
                entry.setAttribute("red", Integer.toString(r));
                entry.setAttribute("green", Integer.toString(g));
                entry.setAttribute("blue", Integer.toString(b2));
                node.appendChild((Node)var5_5);
                ++var4_4;
            }
            var2_1.appendChild((Node)var1_2);
        }
        return var2_1;
    }

    @Override
    protected void mergeNativeTree(Node root) throws IIOInvalidTreeException {
        throw new IllegalStateException("Metadata is read-only!");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IIOMetadataNode getStandardDataNode() {
        void var1_1;
        IIOMetadataNode data_node = new IIOMetadataNode("Data");
        IIOMetadataNode node = null;
        node = new IIOMetadataNode("SampleFormat");
        node.setAttribute("value", "Index");
        data_node.appendChild(node);
        node = new IIOMetadataNode("BitsPerSample");
        node.setAttribute("value", this.colorResolution == -1 ? "" : Integer.toString(this.colorResolution));
        data_node.appendChild(node);
        return var1_1;
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    public b() {
        this(true, nativeMetadataFormatName, "com.sun.imageio.plugins.gif.GIFStreamMetadataFormat", null, null);
    }

    @Override
    public void reset() {
        throw new IllegalStateException("Metadata is read-only!");
    }

    @Override
    protected void mergeStandardTree(Node root) throws IIOInvalidTreeException {
        throw new IllegalStateException("Metadata is read-only!");
    }

    static {
        String[] stringArray = new String[2];
        stringArray[0] = "87a";
        stringArray[1] = "89a";
        versionStrings = stringArray;
        String[] stringArray2 = new String[8];
        stringArray2[0] = "2";
        stringArray2[1] = "4";
        stringArray2[2] = "8";
        stringArray2[3] = "16";
        stringArray2[4] = "32";
        stringArray2[5] = "64";
        stringArray2[6] = "128";
        stringArray2[7] = "256";
        colorTableSizes = stringArray2;
    }

    @Override
    public void setFromTree(String formatName, Node root) throws IIOInvalidTreeException {
        throw new IllegalStateException("Metadata is read-only!");
    }

    @Override
    public IIOMetadataNode getStandardTextNode() {
        return null;
    }

    protected b(boolean standardMetadataFormatSupported, String nativeMetadataFormatName, String nativeMetadataFormatClassName, String[] extraMetadataFormatNames, String[] extraMetadataFormatClassNames) {
        super(standardMetadataFormatSupported, nativeMetadataFormatName, nativeMetadataFormatClassName, extraMetadataFormatNames, extraMetadataFormatClassNames);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IIOMetadataNode getStandardCompressionNode() {
        void var1_1;
        IIOMetadataNode compression_node = new IIOMetadataNode("Compression");
        IIOMetadataNode node = null;
        node = new IIOMetadataNode("CompressionTypeName");
        node.setAttribute("value", "lzw");
        compression_node.appendChild(node);
        node = new IIOMetadataNode("Lossless");
        node.setAttribute("value", "TRUE");
        compression_node.appendChild(node);
        return var1_1;
    }

    @Override
    public IIOMetadataNode getStandardTransparencyNode() {
        return null;
    }

    @Override
    public Node getAsTree(String formatName) {
        if (formatName.equals(nativeMetadataFormatName)) {
            return this.getNativeTree();
        }
        if (formatName.equals("javax_imageio_1.0")) {
            return this.getStandardTree();
        }
        throw new IllegalArgumentException("Not a recognized format!");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IIOMetadataNode getStandardChromaNode() {
        void var1_1;
        IIOMetadataNode chroma_node = new IIOMetadataNode("Chroma");
        IIOMetadataNode node = null;
        node = new IIOMetadataNode("ColorSpaceType");
        node.setAttribute("name", "RGB");
        chroma_node.appendChild(node);
        node = new IIOMetadataNode("BlackIsZero");
        node.setAttribute("value", "TRUE");
        chroma_node.appendChild(node);
        if (this.globalColorTable != null) {
            void var2_2;
            node = new IIOMetadataNode("Palette");
            int numEntries = this.globalColorTable.length / 3;
            int i = 0;
            while (i < numEntries) {
                void var4_4;
                void var5_5;
                IIOMetadataNode entry = new IIOMetadataNode("PaletteEntry");
                entry.setAttribute("index", Integer.toString(i));
                entry.setAttribute("red", Integer.toString(this.globalColorTable[3 * i] & 0xFF));
                entry.setAttribute("green", Integer.toString(this.globalColorTable[3 * i + 1] & 0xFF));
                entry.setAttribute("blue", Integer.toString(this.globalColorTable[3 * i + 2] & 0xFF));
                node.appendChild((Node)var5_5);
                ++var4_4;
            }
            chroma_node.appendChild(node);
            node = new IIOMetadataNode("BackgroundIndex");
            node.setAttribute("value", Integer.toString(this.backgroundColorIndex));
            var1_1.appendChild((Node)var2_2);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IIOMetadataNode getStandardDimensionNode() {
        void var2_2;
        void var1_1;
        IIOMetadataNode dimension_node = new IIOMetadataNode("Dimension");
        IIOMetadataNode node = null;
        node = new IIOMetadataNode("PixelAspectRatio");
        float aspectRatio = 1.0f;
        if (this.pixelAspectRatio != 0) {
            aspectRatio = (float)(this.pixelAspectRatio + 15) / 64.0f;
        }
        node.setAttribute("value", Float.toString(aspectRatio));
        dimension_node.appendChild(node);
        node = new IIOMetadataNode("ImageOrientation");
        node.setAttribute("value", "Normal");
        dimension_node.appendChild(node);
        node = new IIOMetadataNode("HorizontalScreenSize");
        node.setAttribute("value", this.logicalScreenWidth == -1 ? "" : Integer.toString(this.logicalScreenWidth));
        dimension_node.appendChild(node);
        node = new IIOMetadataNode("VerticalScreenSize");
        node.setAttribute("value", this.logicalScreenHeight == -1 ? "" : Integer.toString(this.logicalScreenHeight));
        var1_1.appendChild((Node)var2_2);
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IIOMetadataNode getStandardDocumentNode() {
        void var1_1;
        IIOMetadataNode document_node = new IIOMetadataNode("Document");
        IIOMetadataNode node = null;
        node = new IIOMetadataNode("FormatVersion");
        node.setAttribute("value", this.version);
        document_node.appendChild(node);
        return var1_1;
    }
}

