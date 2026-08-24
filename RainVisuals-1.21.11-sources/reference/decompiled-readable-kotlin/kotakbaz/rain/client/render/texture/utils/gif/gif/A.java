package kotakbaz.rain.client.render.texture.utils.gif.gif;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Node;
import oxxxde.صأ;

// $VF: Compiled from heavy
public class a extends صأ {
   public int disposalMethod;
   public int characterCellWidth;
   public int imageTopPosition;
   public byte[] text;
   public int delayTime;
   public int textGridWidth;
   public boolean interlaceFlag = false;
   public List<byte[]> comments;
   public int imageHeight;
   public List<byte[]> applicationIDs;
   public List<byte[]> applicationData;
   public int textGridTop;
   public int imageWidth;
   public boolean sortFlag = false;
   public boolean transparentColorFlag;
   public int characterCellHeight;
   public int textGridHeight;
   public int textGridLeft;
   public boolean userInputFlag;
   public int textBackgroundColor;
   public int transparentColorIndex;
   static final String nativeMetadataFormatName = "javax_imageio_gif_image_1.0";
   public int textForegroundColor;
   public boolean hasPlainTextExtension;
   public int imageLeftPosition;
   public byte[] localColorTable = null;
   static final String[] disposalMethodNames = new String[]{
      "none",
      "doNotDispose",
      "restoreToBackgroundColor",
      "restoreToPrevious",
      "undefinedDisposalMethod4",
      "undefinedDisposalMethod5",
      "undefinedDisposalMethod6",
      "undefinedDisposalMethod7"
   };
   public List<byte[]> authenticationCodes;

   @Override
   public void setFromTree(String root, Node formatName) throws IIOInvalidTreeException {
      throw new IllegalStateException("Metadata is read-only!");
   }

   @Override
   public IIOMetadataNode getStandardTextNode() {
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
         byte[] comment = (byte[])commentIter.next();
         String s = new String(comment, StandardCharsets.ISO_8859_1);
         node = new IIOMetadataNode("TextEntry");
         node.setAttribute("value", s);
         node.setAttribute("encoding", "ISO-8859-1");
         node.setAttribute("compression", "none");
         text_node.appendChild(node);
      }

      return text_node;
   }

   @Override
   public IIOMetadataNode getStandardTransparencyNode() {
      if (!this.transparentColorFlag) {
         return null;
      }

      IIOMetadataNode transparency_node = new IIOMetadataNode("Transparency");
      IIOMetadataNode node = null;
      node = new IIOMetadataNode("TransparentIndex");
      node.setAttribute("value", Integer.toString(this.transparentColorIndex));
      transparency_node.appendChild(node);
      return transparency_node;
   }

   @Override
   public IIOMetadataNode getStandardDimensionNode() {
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
      dimension_node.appendChild(node);
      return dimension_node;
   }

   @Override
   public IIOMetadataNode getStandardChromaNode() {
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
         node = new IIOMetadataNode("Palette");
         int numEntries = this.localColorTable.length / 3;

         for (int i = 0; i < numEntries; i++) {
            IIOMetadataNode entry = new IIOMetadataNode("PaletteEntry");
            entry.setAttribute("index", Integer.toString(i));
            entry.setAttribute("red", Integer.toString(this.localColorTable[3 * i] & 255));
            entry.setAttribute("green", Integer.toString(this.localColorTable[3 * i + 1] & 255));
            entry.setAttribute("blue", Integer.toString(this.localColorTable[3 * i + 2] & 255));
            node.appendChild(entry);
         }

         chroma_node.appendChild(node);
      }

      return chroma_node;
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
      node = new IIOMetadataNode("NumProgressiveScans");
      node.setAttribute("value", this.interlaceFlag ? "4" : "1");
      compression_node.appendChild(node);
      return compression_node;
   }

   public a() {
      this(true, "javax_imageio_gif_image_1.0", "com.sun.imageio.plugins.gif.GIFImageMetadataFormat", null, null);
   }

   @Override
   public Node getAsTree(String formatName) {
      if (formatName.equals("javax_imageio_gif_image_1.0")) {
         return this.getNativeTree();
      } else if (formatName.equals("javax_imageio_1.0")) {
         return this.getStandardTree();
      } else {
         throw new IllegalArgumentException("Not a recognized format!");
      }
   }

   private Node getNativeTree() {
      IIOMetadataNode root = new IIOMetadataNode("javax_imageio_gif_image_1.0");
      IIOMetadataNode node = new IIOMetadataNode("ImageDescriptor");
      node.setAttribute("imageLeftPosition", Integer.toString(this.imageLeftPosition));
      node.setAttribute("imageTopPosition", Integer.toString(this.imageTopPosition));
      node.setAttribute("imageWidth", Integer.toString(this.imageWidth));
      node.setAttribute("imageHeight", Integer.toString(this.imageHeight));
      node.setAttribute("interlaceFlag", this.interlaceFlag ? "TRUE" : "FALSE");
      root.appendChild(node);
      if (this.localColorTable != null) {
         node = new IIOMetadataNode("LocalColorTable");
         int numAppExtensions = this.localColorTable.length / 3;
         node.setAttribute("sizeOfLocalColorTable", Integer.toString(numAppExtensions));
         node.setAttribute("sortFlag", this.sortFlag ? "TRUE" : "FALSE");

         for (int numComments = 0; numComments < numAppExtensions; numComments++) {
            IIOMetadataNode i = new IIOMetadataNode("ColorTableEntry");
            i.setAttribute("index", Integer.toString(numComments));
            int commentNode = this.localColorTable[3 * numComments] & 255;
            int comment = this.localColorTable[3 * numComments + 1] & 255;
            int appData = this.localColorTable[3 * numComments + 2] & 255;
            i.setAttribute("red", Integer.toString(commentNode));
            i.setAttribute("green", Integer.toString(comment));
            i.setAttribute("blue", Integer.toString(appData));
            node.appendChild(i);
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

      int var14 = this.applicationIDs == null ? 0 : this.applicationIDs.size();
      if (var14 > 0) {
         node = new IIOMetadataNode("ApplicationExtensions");

         for (int var15 = 0; var15 < var14; var15++) {
            IIOMetadataNode var17 = new IIOMetadataNode("ApplicationExtension");
            byte[] var19 = this.applicationIDs.get(var15);
            var17.setAttribute("applicationID", this.toISO8859(var19));
            byte[] var21 = this.authenticationCodes.get(var15);
            var17.setAttribute("authenticationCode", this.toISO8859(var21));
            byte[] var23 = this.applicationData.get(var15);
            var17.setUserObject(var23.clone());
            node.appendChild(var17);
         }

         root.appendChild(node);
      }

      int var16 = this.comments == null ? 0 : this.comments.size();
      if (var16 > 0) {
         node = new IIOMetadataNode("CommentExtensions");

         for (int var18 = 0; var18 < var16; var18++) {
            IIOMetadataNode var20 = new IIOMetadataNode("CommentExtension");
            byte[] var22 = this.comments.get(var18);
            var20.setAttribute("value", this.toISO8859(var22));
            node.appendChild(var20);
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

   @Override
   public IIOMetadataNode getStandardDataNode() {
      IIOMetadataNode data_node = new IIOMetadataNode("Data");
      IIOMetadataNode node = null;
      node = new IIOMetadataNode("SampleFormat");
      node.setAttribute("value", "Index");
      data_node.appendChild(node);
      return data_node;
   }

   protected a(
      boolean nativeMetadataFormatClassName,
      String standardMetadataFormatSupported,
      String extraMetadataFormatClassNames,
      String[] nativeMetadataFormatName,
      String[] extraMetadataFormatNames
   ) {
      super(standardMetadataFormatSupported, nativeMetadataFormatName, nativeMetadataFormatClassName, extraMetadataFormatNames, extraMetadataFormatClassNames);
      this.disposalMethod = 0;
      this.userInputFlag = false;
      this.transparentColorFlag = false;
      this.delayTime = 0;
      this.transparentColorIndex = 0;
      this.hasPlainTextExtension = false;
      this.applicationIDs = null;
      this.authenticationCodes = null;
      this.applicationData = null;
      this.comments = null;
   }
}
