package kotakbaz.rain.client.render.texture.utils.gif.gif;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Node;
import oxxxde.صأ;

// $VF: Compiled from heavy
public class b extends صأ {
   public int pixelAspectRatio;
   public int colorResolution;
   public int logicalScreenHeight;
   public byte[] globalColorTable = null;
   public String version;
   public int backgroundColorIndex;
   public int logicalScreenWidth;
   static final String nativeMetadataFormatName = "javax_imageio_gif_stream_1.0";
   static final String[] versionStrings = new String[]{"87a", "89a"};
   public boolean sortFlag;
   static final String[] colorTableSizes = new String[]{"2", "4", "8", "16", "32", "64", "128", "256"};

   private Node getNativeTree() {
      IIOMetadataNode root = new IIOMetadataNode("javax_imageio_gif_stream_1.0");
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
         node = new IIOMetadataNode("GlobalColorTable");
         int numEntries = this.globalColorTable.length / 3;
         node.setAttribute("sizeOfGlobalColorTable", Integer.toString(numEntries));
         node.setAttribute("backgroundColorIndex", Integer.toString(this.backgroundColorIndex));
         node.setAttribute("sortFlag", this.sortFlag ? "TRUE" : "FALSE");

         for (int i = 0; i < numEntries; i++) {
            IIOMetadataNode entry = new IIOMetadataNode("ColorTableEntry");
            entry.setAttribute("index", Integer.toString(i));
            int r = this.globalColorTable[3 * i] & 255;
            int g = this.globalColorTable[3 * i + 1] & 255;
            int b = this.globalColorTable[3 * i + 2] & 255;
            entry.setAttribute("red", Integer.toString(r));
            entry.setAttribute("green", Integer.toString(g));
            entry.setAttribute("blue", Integer.toString(b));
            node.appendChild(entry);
         }

         root.appendChild(node);
      }

      return root;
   }

   @Override
   protected void mergeNativeTree(Node root) throws IIOInvalidTreeException {
      throw new IllegalStateException("Metadata is read-only!");
   }

   @Override
   public IIOMetadataNode getStandardDataNode() {
      IIOMetadataNode data_node = new IIOMetadataNode("Data");
      IIOMetadataNode node = null;
      node = new IIOMetadataNode("SampleFormat");
      node.setAttribute("value", "Index");
      data_node.appendChild(node);
      node = new IIOMetadataNode("BitsPerSample");
      node.setAttribute("value", this.colorResolution == -1 ? "" : Integer.toString(this.colorResolution));
      data_node.appendChild(node);
      return data_node;
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   public b() {
      this(true, "javax_imageio_gif_stream_1.0", "com.sun.imageio.plugins.gif.GIFStreamMetadataFormat", null, null);
   }

   @Override
   public void reset() {
      throw new IllegalStateException("Metadata is read-only!");
   }

   @Override
   protected void mergeStandardTree(Node root) throws IIOInvalidTreeException {
      throw new IllegalStateException("Metadata is read-only!");
   }

   @Override
   public void setFromTree(String formatName, Node root) throws IIOInvalidTreeException {
      throw new IllegalStateException("Metadata is read-only!");
   }

   @Override
   public IIOMetadataNode getStandardTextNode() {
      return null;
   }

   protected b(
      boolean standardMetadataFormatSupported,
      String nativeMetadataFormatName,
      String extraMetadataFormatNames,
      String[] extraMetadataFormatClassNames,
      String[] nativeMetadataFormatClassName
   ) {
      super(standardMetadataFormatSupported, nativeMetadataFormatName, nativeMetadataFormatClassName, extraMetadataFormatNames, extraMetadataFormatClassNames);
   }

   @Override
   public IIOMetadataNode getStandardCompressionNode() {
      IIOMetadataNode compression_node = new IIOMetadataNode("Compression");
      IIOMetadataNode node = null;
      node = new IIOMetadataNode("CompressionTypeName");
      node.setAttribute("value", "lzw");
      compression_node.appendChild(node);
      node = new IIOMetadataNode("Lossless");
      node.setAttribute("value", "TRUE");
      compression_node.appendChild(node);
      return compression_node;
   }

   @Override
   public IIOMetadataNode getStandardTransparencyNode() {
      return null;
   }

   @Override
   public Node getAsTree(String formatName) {
      if (formatName.equals("javax_imageio_gif_stream_1.0")) {
         return this.getNativeTree();
      } else if (formatName.equals("javax_imageio_1.0")) {
         return this.getStandardTree();
      } else {
         throw new IllegalArgumentException("Not a recognized format!");
      }
   }

   @Override
   public IIOMetadataNode getStandardChromaNode() {
      IIOMetadataNode chroma_node = new IIOMetadataNode("Chroma");
      IIOMetadataNode node = null;
      node = new IIOMetadataNode("ColorSpaceType");
      node.setAttribute("name", "RGB");
      chroma_node.appendChild(node);
      node = new IIOMetadataNode("BlackIsZero");
      node.setAttribute("value", "TRUE");
      chroma_node.appendChild(node);
      if (this.globalColorTable != null) {
         node = new IIOMetadataNode("Palette");
         int numEntries = this.globalColorTable.length / 3;

         for (int i = 0; i < numEntries; i++) {
            IIOMetadataNode entry = new IIOMetadataNode("PaletteEntry");
            entry.setAttribute("index", Integer.toString(i));
            entry.setAttribute("red", Integer.toString(this.globalColorTable[3 * i] & 255));
            entry.setAttribute("green", Integer.toString(this.globalColorTable[3 * i + 1] & 255));
            entry.setAttribute("blue", Integer.toString(this.globalColorTable[3 * i + 2] & 255));
            node.appendChild(entry);
         }

         chroma_node.appendChild(node);
         node = new IIOMetadataNode("BackgroundIndex");
         node.setAttribute("value", Integer.toString(this.backgroundColorIndex));
         chroma_node.appendChild(node);
      }

      return chroma_node;
   }

   @Override
   public IIOMetadataNode getStandardDimensionNode() {
      IIOMetadataNode dimension_node = new IIOMetadataNode("Dimension");
      IIOMetadataNode node = null;
      node = new IIOMetadataNode("PixelAspectRatio");
      float aspectRatio = 1.0F;
      if (this.pixelAspectRatio != 0) {
         aspectRatio = (this.pixelAspectRatio + 15) / 64.0F;
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
      dimension_node.appendChild(node);
      return dimension_node;
   }

   @Override
   public IIOMetadataNode getStandardDocumentNode() {
      IIOMetadataNode document_node = new IIOMetadataNode("Document");
      IIOMetadataNode node = null;
      node = new IIOMetadataNode("FormatVersion");
      node.setAttribute("value", this.version);
      document_node.appendChild(node);
      return document_node;
   }
}
