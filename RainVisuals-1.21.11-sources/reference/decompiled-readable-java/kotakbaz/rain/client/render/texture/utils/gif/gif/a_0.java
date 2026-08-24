/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.utils.gif.gif;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Node;
import oxxxde.\u0635\u0623;

/*
 * Renamed from kotakbaz.rain.client.render.texture.utils.gif.gif.a
 */
public class a_0
extends \u0635\u0623 {
    public int disposalMethod = 0;
    public int characterCellWidth;
    public int imageTopPosition;
    public byte[] text;
    public int delayTime = 0;
    public int textGridWidth;
    public boolean interlaceFlag = false;
    public List<byte[]> comments = null;
    public int imageHeight;
    public List<byte[]> applicationIDs = null;
    public List<byte[]> applicationData = null;
    public int textGridTop;
    public int imageWidth;
    public boolean sortFlag = false;
    public boolean transparentColorFlag = false;
    public int characterCellHeight;
    public int textGridHeight;
    public int textGridLeft;
    public boolean userInputFlag = false;
    public int textBackgroundColor;
    public int transparentColorIndex = 0;
    static final String nativeMetadataFormatName = "javax_imageio_gif_image_1.0";
    public int textForegroundColor;
    public boolean hasPlainTextExtension = false;
    public int imageLeftPosition;
    public byte[] localColorTable = null;
    static final String[] disposalMethodNames;
    public List<byte[]> authenticationCodes = null;

    @Override
    public void setFromTree(String formatName, Node root) throws IIOInvalidTreeException {
        throw new IllegalStateException("Metadata is read-only!");
    }

    static {
        String[] stringArray = new String[8];
        stringArray[0] = "none";
        stringArray[1] = "doNotDispose";
        stringArray[2] = "restoreToBackgroundColor";
        stringArray[3] = "restoreToPrevious";
        stringArray[4] = "undefinedDisposalMethod4";
        stringArray[5] = "undefinedDisposalMethod5";
        stringArray[6] = "undefinedDisposalMethod6";
        stringArray[7] = "undefinedDisposalMethod7";
        disposalMethodNames = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IIOMetadataNode getStandardTextNode() {
        void var2_2;
        if (this.comments == null) {
            return null;
        }
        Iterator<byte[]> commentIter = this.comments.iterator();
        if (!commentIter.hasNext()) {
            return null;
        }
        IIOMetadataNode text_node = new IIOMetadataNode("Text");
        IIOMetadataNode node = null;
        while (commentIter.hasNext()) {
            byte[] comment = commentIter.next();
            String s = new String(comment, StandardCharsets.ISO_8859_1);
            node = new IIOMetadataNode("TextEntry");
            node.setAttribute("value", s);
            node.setAttribute("encoding", "ISO-8859-1");
            node.setAttribute("compression", "none");
            text_node.appendChild(node);
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IIOMetadataNode getStandardTransparencyNode() {
        void var1_1;
        if (!this.transparentColorFlag) {
            return null;
        }
        IIOMetadataNode transparency_node = new IIOMetadataNode("Transparency");
        IIOMetadataNode node = null;
        node = new IIOMetadataNode("TransparentIndex");
        node.setAttribute("value", Integer.toString(this.transparentColorIndex));
        transparency_node.appendChild(node);
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IIOMetadataNode getStandardDimensionNode() {
        void var1_1;
        void var2_2;
        IIOMetadataNode dimension_node = new IIOMetadataNode("Dimension");
        IIOMetadataNode node = null;
        node = new IIOMetadataNode("ImageOrientation");
        node.setAttribute("value", "Normal");
        dimension_node.appendChild(node);
        node = new IIOMetadataNode("HorizontalPixelOffset");
        node.setAttribute("value", Integer.toString(this.imageLeftPosition));
        dimension_node.appendChild(node);
        node = new IIOMetadataNode("VerticalPixelOffset");
        node.setAttribute("value", Integer.toString(this.imageTopPosition));
        dimension_node.appendChild((Node)var2_2);
        return var1_1;
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
        node = new IIOMetadataNode("NumChannels");
        node.setAttribute("value", this.transparentColorFlag ? "4" : "3");
        chroma_node.appendChild(node);
        node = new IIOMetadataNode("BlackIsZero");
        node.setAttribute("value", "TRUE");
        chroma_node.appendChild(node);
        if (this.localColorTable != null) {
            void var2_2;
            node = new IIOMetadataNode("Palette");
            int numEntries = this.localColorTable.length / 3;
            int i = 0;
            while (i < numEntries) {
                void var4_4;
                void var5_5;
                IIOMetadataNode entry = new IIOMetadataNode("PaletteEntry");
                entry.setAttribute("index", Integer.toString(i));
                entry.setAttribute("red", Integer.toString(this.localColorTable[3 * i] & 0xFF));
                entry.setAttribute("green", Integer.toString(this.localColorTable[3 * i + 1] & 0xFF));
                entry.setAttribute("blue", Integer.toString(this.localColorTable[3 * i + 2] & 0xFF));
                node.appendChild((Node)var5_5);
                ++var4_4;
            }
            var1_1.appendChild((Node)var2_2);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IIOMetadataNode getStandardCompressionNode() {
        void var1_1;
        void var2_2;
        IIOMetadataNode compression_node = new IIOMetadataNode("Compression");
        IIOMetadataNode node = null;
        node = new IIOMetadataNode("CompressionTypeName");
        node.setAttribute("value", "lzw");
        compression_node.appendChild(node);
        node = new IIOMetadataNode("Lossless");
        node.setAttribute("value", "TRUE");
        compression_node.appendChild(node);
        node = new IIOMetadataNode("NumProgressiveScans");
        node.setAttribute("value", this.interlaceFlag ? "4" : "1");
        compression_node.appendChild((Node)var2_2);
        return var1_1;
    }

    public a_0() {
        this(true, nativeMetadataFormatName, "com.sun.imageio.plugins.gif.GIFImageMetadataFormat", null, null);
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
    private Node getNativeTree() {
        void var2_1;
        int numComments;
        int i;
        IIOMetadataNode root = new IIOMetadataNode(nativeMetadataFormatName);
        IIOMetadataNode node = new IIOMetadataNode("ImageDescriptor");
        node.setAttribute("imageLeftPosition", Integer.toString(this.imageLeftPosition));
        node.setAttribute("imageTopPosition", Integer.toString(this.imageTopPosition));
        node.setAttribute("imageWidth", Integer.toString(this.imageWidth));
        node.setAttribute("imageHeight", Integer.toString(this.imageHeight));
        node.setAttribute("interlaceFlag", this.interlaceFlag ? "TRUE" : "FALSE");
        root.appendChild(node);
        if (this.localColorTable != null) {
            node = new IIOMetadataNode("LocalColorTable");
            int numEntries = this.localColorTable.length / 3;
            node.setAttribute("sizeOfLocalColorTable", Integer.toString(numEntries));
            node.setAttribute("sortFlag", this.sortFlag ? "TRUE" : "FALSE");
            for (i = 0; i < numEntries; ++i) {
                IIOMetadataNode entry = new IIOMetadataNode("ColorTableEntry");
                entry.setAttribute("index", Integer.toString(i));
                int r = this.localColorTable[3 * i] & 0xFF;
                int g = this.localColorTable[3 * i + 1] & 0xFF;
                int b2 = this.localColorTable[3 * i + 2] & 0xFF;
                entry.setAttribute("red", Integer.toString(r));
                entry.setAttribute("green", Integer.toString(g));
                entry.setAttribute("blue", Integer.toString(b2));
                node.appendChild(entry);
            }
            root.appendChild(node);
        }
        node = new IIOMetadataNode("GraphicControlExtension");
        node.setAttribute("disposalMethod", disposalMethodNames[this.disposalMethod]);
        node.setAttribute("userInputFlag", this.userInputFlag ? "TRUE" : "FALSE");
        node.setAttribute("transparentColorFlag", this.transparentColorFlag ? "TRUE" : "FALSE");
        node.setAttribute("delayTime", Integer.toString(this.delayTime));
        node.setAttribute("transparentColorIndex", Integer.toString(this.transparentColorIndex));
        root.appendChild(node);
        if (this.hasPlainTextExtension) {
            node = new IIOMetadataNode("PlainTextExtension");
            node.setAttribute("textGridLeft", Integer.toString(this.textGridLeft));
            node.setAttribute("textGridTop", Integer.toString(this.textGridTop));
            node.setAttribute("textGridWidth", Integer.toString(this.textGridWidth));
            node.setAttribute("textGridHeight", Integer.toString(this.textGridHeight));
            node.setAttribute("characterCellWidth", Integer.toString(this.characterCellWidth));
            node.setAttribute("characterCellHeight", Integer.toString(this.characterCellHeight));
            node.setAttribute("textForegroundColor", Integer.toString(this.textForegroundColor));
            node.setAttribute("textBackgroundColor", Integer.toString(this.textBackgroundColor));
            node.setAttribute("text", this.toISO8859(this.text));
            root.appendChild(node);
        }
        int numAppExtensions = this.applicationIDs == null ? 0 : this.applicationIDs.size();
        if (numAppExtensions > 0) {
            node = new IIOMetadataNode("ApplicationExtensions");
            for (i = 0; i < numAppExtensions; ++i) {
                void var8_14;
                IIOMetadataNode appExtNode = new IIOMetadataNode("ApplicationExtension");
                byte[] applicationID = this.applicationIDs.get(i);
                appExtNode.setAttribute("applicationID", this.toISO8859(applicationID));
                byte[] authenticationCode = this.authenticationCodes.get(i);
                appExtNode.setAttribute("authenticationCode", this.toISO8859(authenticationCode));
                byte[] appData = this.applicationData.get(i);
                appExtNode.setUserObject(var8_14.clone());
                node.appendChild(appExtNode);
            }
            root.appendChild(node);
        }
        int n = this.comments == null ? 0 : (numComments = this.comments.size());
        if (numComments > 0) {
            void var1_2;
            node = new IIOMetadataNode("CommentExtensions");
            int i2 = 0;
            while (i2 < numComments) {
                void var5_6;
                void var7_12;
                void var6_9;
                IIOMetadataNode commentNode = new IIOMetadataNode("CommentExtension");
                byte[] comment = this.comments.get(i2);
                var6_9.setAttribute("value", this.toISO8859((byte[])var7_12));
                var1_2.appendChild((Node)var6_9);
                ++var5_6;
            }
            var2_1.appendChild((Node)var1_2);
        }
        return var2_1;
    }

    @Override
    protected void mergeNativeTree(Node root) throws IIOInvalidTreeException {
        throw new IllegalStateException("Metadata is read-only!");
    }

    @Override
    protected void mergeStandardTree(Node root) throws IIOInvalidTreeException {
        throw new IllegalStateException("Metadata is read-only!");
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    private String toISO8859(byte[] data) {
        return new String(data, StandardCharsets.ISO_8859_1);
    }

    @Override
    public void reset() {
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
        return var1_1;
    }

    protected a_0(boolean standardMetadataFormatSupported, String nativeMetadataFormatName, String nativeMetadataFormatClassName, String[] extraMetadataFormatNames, String[] extraMetadataFormatClassNames) {
        super(standardMetadataFormatSupported, nativeMetadataFormatName, nativeMetadataFormatClassName, extraMetadataFormatNames, extraMetadataFormatClassNames);
    }
}

