package oxxxde;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.IIOException;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;
import kotakbaz.rain.client.render.texture.utils.gif.gif.a;
import kotakbaz.rain.client.render.texture.utils.gif.gif.b;

// $VF: Compiled from heavy
public class ذئ extends ImageReader {
   int imageMetadataLength;
   WritableRaster theTile;
   int clearCode;
   boolean gotHeader;
   int nextByte;
   private byte[] fallbackColorTable;
   int blockLength;
   List<Long> imageStartPosition;
   final byte[] block;
   Rectangle destinationRegion;
   int width;
   int currIndex;
   boolean decodeThisRow;
   int updateYStep;
   int sourceMaxProgressivePass;
   int bitPos;
   int initCodeSize;
   int rowsDone;
   Point destinationOffset;
   boolean lastBlockFound;
   int eofCode;
   int next32Bits;
   BufferedImage theImage;
   byte[] rowBuf;
   private static byte[] defaultPalette = null;
   int sourceXSubsampling;
   int sourceYSubsampling;
   int numImages;
   int destY;
   int updateMinY;
   static final int[] interlaceOffset = new int[]{0, 4, 2, 1, -1};
   b streamMetadata;
   int streamY;
   a imageMetadata;
   int interlacePass;
   int streamX;
   int height;
   int sourceMinProgressivePass;
   Rectangle sourceRegion;
   ImageInputStream stream = null;
   static final int[] interlaceIncrement = new int[]{8, 8, 4, 2, -1};

   private int getCode(int codeSize, int codeMask) throws IOException {
      if (this.bitPos + codeSize > 32) {
         return this.eofCode;
      }

      int code = this.next32Bits >> this.bitPos & codeMask;

      for (this.bitPos += codeSize; this.bitPos >= 8 && !this.lastBlockFound; this.next32Bits = this.next32Bits | this.block[this.nextByte++] << 24) {
         this.next32Bits >>>= 8;
         this.bitPos -= 8;
         if (this.nextByte >= this.blockLength) {
            this.blockLength = this.stream.readUnsignedByte();
            if (this.blockLength == 0) {
               this.lastBlockFound = true;
               return code;
            }

            int left = this.blockLength;
            int off = 0;

            while (left > 0) {
               int nbytes = this.stream.read(this.block, off, left);
               if (nbytes == -1) {
                  throw new IIOException("Invalid block length for LZW encoded image data");
               }

               off += nbytes;
               left -= nbytes;
            }

            this.nextByte = 0;
         }
      }

      return code;
   }

   @Override
   public BufferedImage read(int param, ImageReadParam imageIndex) throws IIOException {
      if (this.stream == null) {
         throw new IllegalStateException("Input not set!");
      }

      this.checkIndex(imageIndex);
      int index = this.locateImage(imageIndex);
      if (index != imageIndex) {
         throw new IndexOutOfBoundsException("imageIndex out of bounds!");
      }

      this.readMetadata();
      if (param == null) {
         param = this.getDefaultReadParam();
      }

      Iterator<ImageTypeSpecifier> imageTypes = this.getImageTypes(imageIndex);
      this.theImage = getDestination(param, imageTypes, this.imageMetadata.imageWidth, this.imageMetadata.imageHeight);
      this.theTile = this.theImage.getWritableTile(0, 0);
      this.width = this.imageMetadata.imageWidth;
      this.height = this.imageMetadata.imageHeight;
      this.streamX = 0;
      this.streamY = 0;
      this.rowsDone = 0;
      this.interlacePass = 0;
      this.sourceRegion = new Rectangle(0, 0, 0, 0);
      this.destinationRegion = new Rectangle(0, 0, 0, 0);
      computeRegions(param, this.width, this.height, this.theImage, this.sourceRegion, this.destinationRegion);
      this.destinationOffset = new Point(this.destinationRegion.x, this.destinationRegion.y);
      this.sourceXSubsampling = param.getSourceXSubsampling();
      this.sourceYSubsampling = param.getSourceYSubsampling();
      this.sourceMinProgressivePass = Math.max(param.getSourceMinProgressivePass(), 0);
      this.sourceMaxProgressivePass = Math.min(param.getSourceMaxProgressivePass(), 3);
      this.destY = this.destinationRegion.y + (this.streamY - this.sourceRegion.y) / this.sourceYSubsampling;
      this.computeDecodeThisRow();
      this.clearAbortRequest();
      this.processImageStarted(imageIndex);
      if (this.abortRequested()) {
         this.processReadAborted();
         return this.theImage;
      }

      this.startPass(0);
      this.rowBuf = new byte[this.width];

      try {
         this.initCodeSize = this.stream.readUnsignedByte();
         if (this.initCodeSize >= 1 && this.initCodeSize <= 8) {
            this.blockLength = this.stream.readUnsignedByte();
            int e = this.blockLength;
            int off = 0;

            while (e > 0) {
               int NULL_CODE = this.stream.read(this.block, off, e);
               if (NULL_CODE == -1) {
                  throw new IIOException("Invalid block length for LZW encoded image data");
               }

               e -= NULL_CODE;
               off += NULL_CODE;
            }

            this.bitPos = 0;
            this.nextByte = 0;
            this.lastBlockFound = false;
            this.interlacePass = 0;
            this.initNext32Bits();
            this.clearCode = 1 << this.initCodeSize;
            this.eofCode = this.clearCode + 1;
            int var22 = -1;
            int oldCode = -1;
            int[] prefix = new int[4096];
            byte[] suffix = new byte[4096];
            byte[] initial = new byte[4096];
            int[] length = new int[4096];
            byte[] string = new byte[4096];
            this.initializeStringTable(prefix, suffix, initial, length);
            int tableIndex = (1 << this.initCodeSize) + 2;
            int codeSize = this.initCodeSize + 1;
            int codeMask = (1 << codeSize) - 1;

            do {
               int code = this.getCode(codeSize, codeMask);
               if (code == this.clearCode) {
                  this.initializeStringTable(prefix, suffix, initial, length);
                  tableIndex = (1 << this.initCodeSize) + 2;
                  codeSize = this.initCodeSize + 1;
                  codeMask = (1 << codeSize) - 1;
                  code = this.getCode(codeSize, codeMask);
                  int var23 = -1;
                  if (code == this.eofCode) {
                     this.processImageComplete();
                     return this.theImage;
                  }
               } else {
                  if (code == this.eofCode) {
                     this.processImageComplete();
                     return this.theImage;
                  }

                  int c;
                  if (code < tableIndex) {
                     c = code;
                  } else {
                     c = oldCode;
                     if (code != tableIndex) {
                        this.processWarningOccurred("Out-of-sequence code!");
                     }
                  }

                  if (-1 != oldCode && tableIndex < 4096) {
                     int len = tableIndex;
                     int i = oldCode;
                     prefix[len] = i;
                     suffix[len] = initial[c];
                     initial[len] = initial[i];
                     length[len] = length[i] + 1;
                     tableIndex++;
                     if (tableIndex == 1 << codeSize && tableIndex < 4096) {
                        codeSize++;
                        codeMask = (1 << codeSize) - 1;
                     }
                  }
               }

               int var24 = code;
               int var25 = length[var24];

               for (int var26 = var25 - 1; var26 >= 0; var26--) {
                  string[var26] = suffix[var24];
                  var24 = prefix[var24];
               }

               this.outputPixels(string, var25);
               oldCode = code;
            } while (!this.abortRequested());

            this.processReadAborted();
            return this.theImage;
         } else {
            throw new IIOException("Bad code size:" + this.initCodeSize);
         }
      } catch (IOException var21) {
         throw new IIOException("I/O error reading image!", var21);
      }
   }

   private void resetStreamSettings() {
      this.gotHeader = false;
      this.streamMetadata = null;
      this.currIndex = -1;
      this.imageMetadata = null;
      this.imageStartPosition = new ArrayList<>();
      this.numImages = -1;
      this.blockLength = 0;
      this.bitPos = 0;
      this.nextByte = 0;
      this.next32Bits = 0;
      this.lastBlockFound = false;
      this.theImage = null;
      this.theTile = null;
      this.width = -1;
      this.height = -1;
      this.streamX = -1;
      this.streamY = -1;
      this.rowsDone = 0;
      this.interlacePass = 0;
      this.fallbackColorTable = null;
   }

   private int locateImage(int imageIndex) throws IIOException {
      this.readHeader();

      try {
         int e = Math.min(imageIndex, this.imageStartPosition.size() - 1);
         Long l = this.imageStartPosition.get(e);
         this.stream.seek(l);

         while (e < imageIndex) {
            if (!this.skipImage()) {
               return e - 1;
            }

            Long l1 = this.stream.getStreamPosition();
            this.imageStartPosition.add(l1);
            e++;
         }
      } catch (IOException var5) {
         throw new IIOException("Couldn't seek!", var5);
      }

      if (this.currIndex != imageIndex) {
         this.imageMetadata = null;
      }

      this.currIndex = imageIndex;
      return imageIndex;
   }

   public ذئ(ImageReaderSpi originatingProvider) {
      super(originatingProvider);
      this.gotHeader = false;
      this.streamMetadata = null;
      this.currIndex = -1;
      this.imageMetadata = null;
      this.imageStartPosition = new ArrayList<>();
      this.numImages = -1;
      this.block = new byte[255];
      this.blockLength = 0;
      this.bitPos = 0;
      this.nextByte = 0;
      this.next32Bits = 0;
      this.lastBlockFound = false;
      this.theImage = null;
      this.theTile = null;
      this.width = -1;
      this.height = -1;
      this.streamX = -1;
      this.streamY = -1;
      this.rowsDone = 0;
      this.interlacePass = 0;
      this.fallbackColorTable = null;
      this.decodeThisRow = true;
      this.destY = 0;
   }

   public void initializeStringTable(int[] initial, byte[] prefix, byte[] suffix, int[] length) {
      int numEntries = 1 << this.initCodeSize;

      for (int i = 0; i < numEntries; i++) {
         prefix[i] = -1;
         suffix[i] = (byte)i;
         initial[i] = (byte)i;
         length[i] = 1;
      }

      for (int var7 = numEntries; var7 < 4096; var7++) {
         prefix[var7] = -1;
         length[var7] = 1;
      }
   }

   @Override
   public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) throws IIOException {
      this.checkIndex(imageIndex);
      int index = this.locateImage(imageIndex);
      if (index != imageIndex) {
         throw new IndexOutOfBoundsException();
      }

      this.readMetadata();
      List<ImageTypeSpecifier> l = new ArrayList(1);
      byte[] colorTable;
      if (this.imageMetadata.localColorTable != null) {
         colorTable = this.imageMetadata.localColorTable;
         this.fallbackColorTable = this.imageMetadata.localColorTable;
      } else {
         colorTable = this.streamMetadata.globalColorTable;
      }

      if (colorTable == null) {
         if (this.fallbackColorTable == null) {
            this.processWarningOccurred("Use default color table.");
            this.fallbackColorTable = getDefaultPalette();
         }

         colorTable = this.fallbackColorTable;
      }

      int length = colorTable.length / 3;
      int bits;
      if (length == 2) {
         bits = 1;
      } else if (length == 4) {
         bits = 2;
      } else if (length != 8 && length != 16) {
         bits = 8;
      } else {
         bits = 4;
      }

      int lutLength = 1 << bits;
      byte[] r = new byte[lutLength];
      byte[] g = new byte[lutLength];
      byte[] b = new byte[lutLength];
      int rgbIndex = 0;

      for (int i = 0; i < length; i++) {
         r[i] = colorTable[rgbIndex++];
         g[i] = colorTable[rgbIndex++];
         b[i] = colorTable[rgbIndex++];
      }

      l.add(this.createIndexed(r, g, b, bits));
      return l.iterator();
   }

   @Override
   public ImageReadParam getDefaultReadParam() {
      return new ImageReadParam();
   }

   @Override
   public IIOMetadata getImageMetadata(int imageIndex) throws IIOException {
      this.checkIndex(imageIndex);
      int index = this.locateImage(imageIndex);
      if (index != imageIndex) {
         throw new IndexOutOfBoundsException("Bad image index!");
      }

      this.readMetadata();
      return this.imageMetadata;
   }

   @Override
   public void reset() {
      super.reset();
      this.resetStreamSettings();
   }

   private void outputRow() {
      int width = Math.min(this.sourceRegion.width, this.destinationRegion.width * this.sourceXSubsampling);
      int destX = this.destinationRegion.x;
      if (this.sourceXSubsampling == 1) {
         this.theTile.setDataElements(destX, this.destY, width, 1, this.rowBuf);
      } else {
         for (int bands = 0; bands < width; destX++) {
            this.theTile.setSample(destX, this.destY, 0, this.rowBuf[bands] & 255);
            bands += this.sourceXSubsampling;
         }
      }

      if (this.updateListeners != null) {
         int[] var4 = new int[]{0};
         this.processImageUpdate(this.theImage, destX, this.destY, width, 1, 1, this.updateYStep, var4);
      }
   }

   @Override
   public int getNumImages(boolean allowSearch) throws IIOException {
      if (this.stream == null) {
         throw new IllegalStateException("Input not set!");
      }

      if (this.seekForwardOnly && allowSearch) {
         throw new IllegalStateException("seekForwardOnly and allowSearch can't both be true!");
      }

      if (this.numImages > 0) {
         return this.numImages;
      }

      if (allowSearch) {
         this.numImages = this.locateImage(Integer.MAX_VALUE) + 1;
      }

      return this.numImages;
   }

   @Override
   public int getWidth(int imageIndex) throws IIOException {
      this.checkIndex(imageIndex);
      int index = this.locateImage(imageIndex);
      if (index != imageIndex) {
         throw new IndexOutOfBoundsException();
      }

      this.readMetadata();
      return this.imageMetadata.imageWidth;
   }

   private byte[] concatenateBlocks() throws IOException {
      byte[] data = new byte[0];

      while (true) {
         int length = this.stream.readUnsignedByte();
         if (length == 0) {
            return data;
         }

         if (this.ignoreMetadata) {
            this.stream.skipBytes(length);
         } else {
            byte[] subBlockData = زف.staggeredReadByteStream(this.stream, length);
            byte[] newData = new byte[data.length + length];
            System.arraycopy(data, 0, newData, 0, data.length);
            System.arraycopy(subBlockData, 0, newData, data.length, length);
            data = newData;
         }
      }
   }

   private void readHeader() throws IIOException {
      if (!this.gotHeader) {
         if (this.stream == null) {
            throw new IllegalStateException("Input not set!");
         }

         this.streamMetadata = new b();

         try {
            this.stream.setByteOrder(ByteOrder.LITTLE_ENDIAN);
            byte[] signature = new byte[6];
            this.stream.readFully(signature);
            StringBuilder version = new StringBuilder(3);
            version.append((char)signature[3]);
            version.append((char)signature[4]);
            version.append((char)signature[5]);
            this.streamMetadata.version = version.toString();
            this.streamMetadata.logicalScreenWidth = this.stream.readUnsignedShort();
            this.streamMetadata.logicalScreenHeight = this.stream.readUnsignedShort();
            int packedFields = this.stream.readUnsignedByte();
            boolean globalColorTableFlag = (packedFields & 128) != 0;
            this.streamMetadata.colorResolution = (packedFields >> 4 & 7) + 1;
            this.streamMetadata.sortFlag = (packedFields & 8) != 0;
            int numGCTEntries = 1 << (packedFields & 7) + 1;
            this.streamMetadata.backgroundColorIndex = this.stream.readUnsignedByte();
            this.streamMetadata.pixelAspectRatio = this.stream.readUnsignedByte();
            if (globalColorTableFlag) {
               this.streamMetadata.globalColorTable = new byte[3 * numGCTEntries];
               this.stream.readFully(this.streamMetadata.globalColorTable);
            } else {
               this.streamMetadata.globalColorTable = null;
            }

            this.imageStartPosition.add(this.stream.getStreamPosition());
         } catch (IOException var6) {
            throw new IIOException("I/O error reading header!", var6);
         }

         this.gotHeader = true;
      }
   }

   private ImageTypeSpecifier createIndexed(byte[] g, byte[] r, byte[] b, int bits) {
      IndexColorModel colorModel;
      if (this.imageMetadata.transparentColorFlag) {
         int idx = Math.min(this.imageMetadata.transparentColorIndex, r.length - 1);
         colorModel = new IndexColorModel(bits, r.length, r, g, b, idx);
      } else {
         colorModel = new IndexColorModel(bits, r.length, r, g, b);
      }

      SampleModel var8;
      if (bits == 8) {
         int[] bandOffsets = new int[]{0};
         var8 = new PixelInterleavedSampleModel(0, 1, 1, 1, 1, bandOffsets);
      } else {
         var8 = new MultiPixelPackedSampleModel(0, 1, 1, bits);
      }

      return new ImageTypeSpecifier(colorModel, var8);
   }

   private boolean skipImage() throws IIOException {
      try {
         label56:
         while (true) {
            int blockType = this.stream.readUnsignedByte();
            if (blockType != 44) {
               if (blockType == 59) {
                  return false;
               }

               if (blockType == 33) {
                  int var8 = this.stream.readUnsignedByte();
                  int var11 = 0;

                  while (true) {
                     var11 = this.stream.readUnsignedByte();
                     this.stream.skipBytes(var11);
                     if (var11 <= 0) {
                        continue label56;
                     }
                  }
               }

               if (blockType == 0) {
                  return false;
               }

               int var6 = 0;

               while (true) {
                  var6 = this.stream.readUnsignedByte();
                  this.stream.skipBytes(var6);
                  if (var6 <= 0) {
                     continue label56;
                  }
               }
            }

            this.stream.skipBytes(8);
            int packedFields = this.stream.readUnsignedByte();
            if ((packedFields & 128) != 0) {
               int length = (packedFields & 7) + 1;
               this.stream.skipBytes(3 * (1 << length));
            }

            this.stream.skipBytes(1);
            int var9 = 0;

            do {
               var9 = this.stream.readUnsignedByte();
               this.stream.skipBytes(var9);
            } while (var9 > 0);

            return true;
         }
      } catch (EOFException var4) {
         return false;
      } catch (IOException var5) {
         throw new IIOException("I/O error locating image!", var5);
      }
   }

   @Override
   public IIOMetadata getStreamMetadata() throws IIOException {
      this.readHeader();
      return this.streamMetadata;
   }

   private static synchronized byte[] getDefaultPalette() {
      if (defaultPalette == null) {
         BufferedImage img = new BufferedImage(1, 1, 13);
         IndexColorModel icm = (IndexColorModel)img.getColorModel();
         int size = icm.getMapSize();
         byte[] r = new byte[size];
         byte[] g = new byte[size];
         byte[] b = new byte[size];
         icm.getReds(r);
         icm.getGreens(g);
         icm.getBlues(b);
         defaultPalette = new byte[size * 3];

         for (int i = 0; i < size; i++) {
            defaultPalette[3 * i] = r[i];
            defaultPalette[3 * i + 1] = g[i];
            defaultPalette[3 * i + 2] = b[i];
         }
      }

      return defaultPalette;
   }

   private void readMetadata() throws IIOException {
      if (this.stream == null) {
         throw new IllegalStateException("Input not set!");
      }

      try {
         this.imageMetadata = new a();
         long startPosition = this.stream.getStreamPosition();

         while (true) {
            int blockType = this.stream.readUnsignedByte();
            if (blockType == 44) {
               this.imageMetadata.imageLeftPosition = this.stream.readUnsignedShort();
               this.imageMetadata.imageTopPosition = this.stream.readUnsignedShort();
               this.imageMetadata.imageWidth = this.stream.readUnsignedShort();
               this.imageMetadata.imageHeight = this.stream.readUnsignedShort();
               int idPackedFields = this.stream.readUnsignedByte();
               boolean var21 = (idPackedFields & 128) != 0;
               this.imageMetadata.interlaceFlag = (idPackedFields & 64) != 0;
               this.imageMetadata.sortFlag = (idPackedFields & 32) != 0;
               int var24 = 1 << (idPackedFields & 7) + 1;
               if (var21) {
                  this.imageMetadata.localColorTable = زف.staggeredReadByteStream(this.stream, 3 * var24);
               } else {
                  this.imageMetadata.localColorTable = null;
               }

               this.imageMetadataLength = (int)(this.stream.getStreamPosition() - startPosition);
               return;
            }

            if (blockType != 33) {
               if (blockType == 59) {
                  throw new IndexOutOfBoundsException("Attempt to read past end of image sequence!");
               }

               throw new IIOException("Unexpected block type " + blockType + "!");
            }

            int label = this.stream.readUnsignedByte();
            if (label == 249) {
               int var20 = this.stream.readUnsignedByte();
               int var23 = this.stream.readUnsignedByte();
               this.imageMetadata.disposalMethod = var23 >> 2 & 3;
               this.imageMetadata.userInputFlag = (var23 & 2) != 0;
               this.imageMetadata.transparentColorFlag = (var23 & 1) != 0;
               this.imageMetadata.delayTime = this.stream.readUnsignedShort();
               this.imageMetadata.transparentColorIndex = this.stream.readUnsignedByte();
               int var25 = this.stream.readUnsignedByte();
            } else if (label == 1) {
               int var19 = this.stream.readUnsignedByte();
               if (!this.ignoreMetadata) {
                  this.imageMetadata.hasPlainTextExtension = true;
                  this.imageMetadata.textGridLeft = this.stream.readUnsignedShort();
                  this.imageMetadata.textGridTop = this.stream.readUnsignedShort();
                  this.imageMetadata.textGridWidth = this.stream.readUnsignedShort();
                  this.imageMetadata.textGridHeight = this.stream.readUnsignedShort();
                  this.imageMetadata.characterCellWidth = this.stream.readUnsignedByte();
                  this.imageMetadata.characterCellHeight = this.stream.readUnsignedByte();
                  this.imageMetadata.textForegroundColor = this.stream.readUnsignedByte();
                  this.imageMetadata.textBackgroundColor = this.stream.readUnsignedByte();
               } else {
                  this.stream.skipBytes(var19);
               }

               this.imageMetadata.text = this.concatenateBlocks();
            } else if (label == 254) {
               byte[] var18 = this.concatenateBlocks();
               if (!this.ignoreMetadata) {
                  if (this.imageMetadata.comments == null) {
                     this.imageMetadata.comments = new ArrayList<>();
                  }

                  this.imageMetadata.comments.add(var18);
               }
            } else if (label == 255) {
               int var17 = this.stream.readUnsignedByte();
               int offset = 0;
               byte[] blockData = new byte[0];
               byte[] applicationID = new byte[8];
               byte[] authCode = new byte[3];
               if (!this.ignoreMetadata) {
                  blockData = زف.staggeredReadByteStream(this.stream, var17);
                  offset = this.copyData(blockData, 0, applicationID);
                  offset = this.copyData(blockData, offset, authCode);
               } else {
                  this.stream.skipBytes(var17);
               }

               byte[] applicationData = this.concatenateBlocks();
               if (!this.ignoreMetadata && offset < var17) {
                  int len = var17 - offset;
                  byte[] data = new byte[len + applicationData.length];
                  System.arraycopy(blockData, offset, data, 0, len);
                  System.arraycopy(applicationData, 0, data, len, applicationData.length);
                  applicationData = data;
               }

               if (!this.ignoreMetadata) {
                  if (this.imageMetadata.applicationIDs == null) {
                     this.imageMetadata.applicationIDs = new ArrayList<>();
                     this.imageMetadata.authenticationCodes = new ArrayList<>();
                     this.imageMetadata.applicationData = new ArrayList<>();
                  }

                  this.imageMetadata.applicationIDs.add(applicationID);
                  this.imageMetadata.authenticationCodes.add(authCode);
                  this.imageMetadata.applicationData.add(applicationData);
               }
            } else {
               int length = 0;

               while (true) {
                  length = this.stream.readUnsignedByte();
                  this.stream.skipBytes(length);
                  if (length <= 0) {
                     break;
                  }
               }
            }
         }
      } catch (IIOException var13) {
         throw var13;
      } catch (IOException var14) {
         throw new IIOException("I/O error reading image metadata!", var14);
      }
   }

   private void initNext32Bits() {
      this.next32Bits = this.block[0] & 255;
      this.next32Bits = this.next32Bits | (this.block[1] & 255) << 8;
      this.next32Bits = this.next32Bits | (this.block[2] & 255) << 16;
      this.next32Bits = this.next32Bits | this.block[3] << 24;
      this.nextByte = 4;
   }

   private void outputPixels(byte[] len, int string) {
      if (this.interlacePass >= this.sourceMinProgressivePass && this.interlacePass <= this.sourceMaxProgressivePass) {
         for (int i = 0; i < len; i++) {
            if (this.streamX >= this.sourceRegion.x) {
               this.rowBuf[this.streamX - this.sourceRegion.x] = string[i];
            }

            this.streamX++;
            if (this.streamX == this.width) {
               this.rowsDone++;
               this.processImageProgress(100.0F * this.rowsDone / this.height);
               if (this.abortRequested()) {
                  return;
               }

               if (this.decodeThisRow) {
                  this.outputRow();
               }

               this.streamX = 0;
               if (this.imageMetadata.interlaceFlag) {
                  this.streamY = this.streamY + interlaceIncrement[this.interlacePass];
                  if (this.streamY >= this.height) {
                     if (this.updateListeners != null) {
                        this.processPassComplete(this.theImage);
                     }

                     this.interlacePass++;
                     if (this.interlacePass > this.sourceMaxProgressivePass) {
                        return;
                     }

                     this.streamY = interlaceOffset[this.interlacePass];
                     this.startPass(this.interlacePass);
                  }
               } else {
                  this.streamY++;
               }

               this.destY = this.destinationRegion.y + (this.streamY - this.sourceRegion.y) / this.sourceYSubsampling;
               this.computeDecodeThisRow();
            }
         }
      }
   }

   @Override
   public void setInput(Object input, boolean ignoreMetadata, boolean seekForwardOnly) {
      super.setInput(input, seekForwardOnly, ignoreMetadata);
      if (input != null) {
         if (!(input instanceof ImageInputStream)) {
            throw new IllegalArgumentException("input not an ImageInputStream!");
         }

         this.stream = (ImageInputStream)input;
      } else {
         this.stream = null;
      }

      this.resetStreamSettings();
   }

   @Override
   public int getHeight(int imageIndex) throws IIOException {
      this.checkIndex(imageIndex);
      int index = this.locateImage(imageIndex);
      if (index != imageIndex) {
         throw new IndexOutOfBoundsException();
      }

      this.readMetadata();
      return this.imageMetadata.imageHeight;
   }

   private int copyData(byte[] offset, int src, byte[] dst) {
      int len = dst.length;
      int rest = src.length - offset;
      if (len > rest) {
         len = rest;
      }

      System.arraycopy(src, offset, dst, 0, len);
      return offset + len;
   }

   private void startPass(int pass) {
      if (this.updateListeners != null && this.imageMetadata.interlaceFlag) {
         int y = interlaceOffset[this.interlacePass];
         int yStep = interlaceIncrement[this.interlacePass];
         int[] vals = زف.computeUpdatedPixels(
            this.sourceRegion,
            this.destinationOffset,
            this.destinationRegion.x,
            this.destinationRegion.y,
            this.destinationRegion.x + this.destinationRegion.width - 1,
            this.destinationRegion.y + this.destinationRegion.height - 1,
            this.sourceXSubsampling,
            this.sourceYSubsampling,
            0,
            y,
            this.destinationRegion.width,
            (this.destinationRegion.height + yStep - 1) / yStep,
            1,
            yStep
         );
         this.updateMinY = vals[1];
         this.updateYStep = vals[5];
         int[] bands = new int[]{0};
         this.processPassStarted(
            this.theImage, this.interlacePass, this.sourceMinProgressivePass, this.sourceMaxProgressivePass, 0, this.updateMinY, 1, this.updateYStep, bands
         );
      }
   }

   private void computeDecodeThisRow() {
      this.decodeThisRow = this.destY < this.destinationRegion.y + this.destinationRegion.height
         && this.streamY >= this.sourceRegion.y
         && this.streamY < this.sourceRegion.y + this.sourceRegion.height
         && (this.streamY - this.sourceRegion.y) % this.sourceYSubsampling == 0;
   }

   private void checkIndex(int imageIndex) {
      if (imageIndex < this.minIndex) {
         throw new IndexOutOfBoundsException("imageIndex < minIndex!");
      }

      if (this.seekForwardOnly) {
         this.minIndex = imageIndex;
      }
   }
}
