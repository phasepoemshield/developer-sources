/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.PixelInterleavedSampleModel;
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
import kotakbaz.rain.client.render.texture.utils.gif.gif.a_0;
import kotakbaz.rain.client.render.texture.utils.gif.gif.b;
import oxxxde.\u0632\u0641;

public class \u0630\u0626
extends ImageReader {
    int imageMetadataLength;
    WritableRaster theTile = null;
    int clearCode;
    boolean gotHeader = false;
    int nextByte = 0;
    private byte[] fallbackColorTable = null;
    int blockLength = 0;
    List<Long> imageStartPosition = new ArrayList<Long>();
    final byte[] block = new byte[255];
    Rectangle destinationRegion;
    int width = -1;
    int currIndex = -1;
    boolean decodeThisRow = true;
    int updateYStep;
    int sourceMaxProgressivePass;
    int bitPos = 0;
    int initCodeSize;
    int rowsDone = 0;
    Point destinationOffset;
    boolean lastBlockFound = false;
    int eofCode;
    int next32Bits = 0;
    BufferedImage theImage = null;
    byte[] rowBuf;
    private static byte[] defaultPalette;
    int sourceXSubsampling;
    int sourceYSubsampling;
    int numImages = -1;
    int destY = 0;
    int updateMinY;
    static final int[] interlaceOffset;
    b streamMetadata = null;
    int streamY = -1;
    a_0 imageMetadata = null;
    int interlacePass = 0;
    int streamX = -1;
    int height = -1;
    int sourceMinProgressivePass;
    Rectangle sourceRegion;
    ImageInputStream stream = null;
    static final int[] interlaceIncrement;

    /*
     * WARNING - void declaration
     */
    private int getCode(int codeSize, int codeMask) throws IOException {
        void var3_3;
        if (this.bitPos + codeSize > 32) {
            return this.eofCode;
        }
        int code = this.next32Bits >> this.bitPos & codeMask;
        this.bitPos += codeSize;
        while (this.bitPos >= 8 && !this.lastBlockFound) {
            this.next32Bits >>>= 8;
            this.bitPos -= 8;
            if (this.nextByte >= this.blockLength) {
                void var6_6;
                this.blockLength = this.stream.readUnsignedByte();
                if (this.blockLength == 0) {
                    this.lastBlockFound = true;
                    return code;
                }
                int off = 0;
                for (int left = this.blockLength; left > 0; left -= var6_6) {
                    int nbytes = this.stream.read(this.block, off, left);
                    if (nbytes == -1) {
                        throw new IIOException("Invalid block length for LZW encoded image data");
                    }
                    off += nbytes;
                }
                this.nextByte = 0;
            }
            int n = this.nextByte;
            this.nextByte = n + 1;
            this.next32Bits |= this.block[n] << 24;
        }
        return (int)var3_3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public BufferedImage read(int imageIndex, ImageReadParam param) throws IIOException {
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
        this.theImage = \u0630\u0626.getDestination(param, imageTypes, this.imageMetadata.imageWidth, this.imageMetadata.imageHeight);
        this.theTile = this.theImage.getWritableTile(0, 0);
        this.width = this.imageMetadata.imageWidth;
        this.height = this.imageMetadata.imageHeight;
        this.streamX = 0;
        this.streamY = 0;
        this.rowsDone = 0;
        this.interlacePass = 0;
        this.sourceRegion = new Rectangle(0, 0, 0, 0);
        this.destinationRegion = new Rectangle(0, 0, 0, 0);
        \u0630\u0626.computeRegions(param, this.width, this.height, this.theImage, this.sourceRegion, this.destinationRegion);
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
            if (this.initCodeSize < 1 || this.initCodeSize > 8) {
                throw new IIOException("Bad code size:" + this.initCodeSize);
            }
            int left = this.blockLength = this.stream.readUnsignedByte();
            int off = 0;
            while (left > 0) {
                int nbytes = this.stream.read(this.block, off, left);
                if (nbytes == -1) {
                    throw new IIOException("Invalid block length for LZW encoded image data");
                }
                left -= nbytes;
                off += nbytes;
            }
            this.bitPos = 0;
            this.nextByte = 0;
            this.lastBlockFound = false;
            this.interlacePass = 0;
            this.initNext32Bits();
            this.clearCode = 1 << this.initCodeSize;
            this.eofCode = this.clearCode + 1;
            int NULL_CODE = -1;
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
                void var8_18;
                void var14_14;
                void var18_19;
                int code;
                if ((code = this.getCode(codeSize, codeMask)) == this.clearCode) {
                    this.initializeStringTable(prefix, suffix, initial, length);
                    tableIndex = (1 << this.initCodeSize) + 2;
                    codeSize = this.initCodeSize + 1;
                    codeMask = (1 << codeSize) - 1;
                    code = this.getCode(codeSize, codeMask);
                    oldCode = -1;
                    if (code == this.eofCode) {
                        this.processImageComplete();
                        return this.theImage;
                    }
                } else {
                    int newSuffixIndex;
                    if (code == this.eofCode) {
                        this.processImageComplete();
                        return this.theImage;
                    }
                    if (code < tableIndex) {
                        newSuffixIndex = code;
                    } else {
                        newSuffixIndex = oldCode;
                        if (code != tableIndex) {
                            this.processWarningOccurred("Out-of-sequence code!");
                        }
                    }
                    if (-1 != oldCode && tableIndex < 4096) {
                        int oc;
                        int ti = tableIndex++;
                        prefix[ti] = oc = oldCode;
                        suffix[ti] = initial[newSuffixIndex];
                        initial[ti] = initial[oc];
                        length[ti] = length[oc] + 1;
                        if (tableIndex == 1 << codeSize && tableIndex < 4096) {
                            codeMask = (1 << ++codeSize) - 1;
                        }
                    }
                }
                int c = code;
                int n = length[var18_19];
                for (int i = n - 1; i >= 0; --i) {
                    void var10_10;
                    void var11_11;
                    var14_14[i] = var11_11[var18_19];
                    var18_19 = var10_10[var18_19];
                }
                this.outputPixels((byte[])var14_14, n);
                void var9_9 = var8_18;
            } while (!this.abortRequested());
            this.processReadAborted();
            return this.theImage;
        }
        catch (IOException iOException) {
            throw new IIOException("I/O error reading image!", iOException);
        }
    }

    private void resetStreamSettings() {
        this.gotHeader = false;
        this.streamMetadata = null;
        this.currIndex = -1;
        this.imageMetadata = null;
        this.imageStartPosition = new ArrayList<Long>();
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

    /*
     * WARNING - void declaration
     */
    private int locateImage(int imageIndex) throws IIOException {
        void var1_1;
        this.readHeader();
        try {
            int index;
            Long l = this.imageStartPosition.get(index);
            this.stream.seek(l);
            for (index = Math.min(imageIndex, this.imageStartPosition.size() - 1); index < imageIndex; ++index) {
                if (!this.skipImage()) {
                    return --index;
                }
                Long l1 = this.stream.getStreamPosition();
                this.imageStartPosition.add(l1);
            }
        }
        catch (IOException e) {
            void var2_3;
            throw new IIOException("Couldn't seek!", (Throwable)var2_3);
        }
        if (this.currIndex != imageIndex) {
            this.imageMetadata = null;
        }
        this.currIndex = var1_1;
        return (int)var1_1;
    }

    public \u0630\u0626(ImageReaderSpi originatingProvider) {
        super(originatingProvider);
    }

    /*
     * WARNING - void declaration
     */
    public void initializeStringTable(int[] prefix, byte[] suffix, byte[] initial, int[] length) {
        int i;
        int numEntries = 1 << this.initCodeSize;
        for (i = 0; i < numEntries; ++i) {
            prefix[i] = -1;
            suffix[i] = (byte)i;
            initial[i] = (byte)i;
            length[i] = 1;
        }
        i = numEntries;
        while (i < 4096) {
            void var6_6;
            prefix[i] = -1;
            length[i] = 1;
            ++var6_6;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) throws IIOException {
        block9: {
            block10: {
                block8: {
                    this.checkIndex(imageIndex);
                    index = this.locateImage(imageIndex);
                    if (index != imageIndex) {
                        throw new IndexOutOfBoundsException();
                    }
                    this.readMetadata();
                    l = new ArrayList<ImageTypeSpecifier>(1);
                    if (this.imageMetadata.localColorTable != null) {
                        colorTable = this.imageMetadata.localColorTable;
                        this.fallbackColorTable = this.imageMetadata.localColorTable;
                    } else {
                        colorTable = this.streamMetadata.globalColorTable;
                    }
                    if (colorTable == null) {
                        if (this.fallbackColorTable == null) {
                            this.processWarningOccurred("Use default color table.");
                            this.fallbackColorTable = \u0630\u0626.getDefaultPalette();
                        }
                        colorTable = this.fallbackColorTable;
                    }
                    length = colorTable.length / 3;
                    if (length != 2) break block8;
                    bits = 1;
                    break block9;
                }
                if (length != 4) break block10;
                bits = 2;
                break block9;
            }
            if (length == 8) ** GOTO lbl35
            if (length == 16) {
lbl35:
                // 2 sources

                bits = 4;
            } else {
                bits = 8;
            }
        }
        lutLength = 1 << bits;
        r = new byte[lutLength];
        g = new byte[lutLength];
        b = new byte[lutLength];
        rgbIndex = 0;
        i = 0;
        while (i < length) {
            r[i] = colorTable[rgbIndex++];
            g[i] = colorTable[rgbIndex++];
            b[i] = colorTable[rgbIndex++];
            ++var12_12;
        }
        l.add(this.createIndexed(r, g, b, bits));
        return var3_3.iterator();
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

    /*
     * WARNING - void declaration
     */
    private void outputRow() {
        int width = Math.min(this.sourceRegion.width, this.destinationRegion.width * this.sourceXSubsampling);
        int destX = this.destinationRegion.x;
        if (this.sourceXSubsampling == 1) {
            this.theTile.setDataElements(destX, this.destY, width, 1, this.rowBuf);
        } else {
            int x = 0;
            while (x < width) {
                this.theTile.setSample(destX, this.destY, 0, this.rowBuf[x] & 0xFF);
                x += this.sourceXSubsampling;
                ++destX;
            }
        }
        if (this.updateListeners != null) {
            void var3_4;
            void var1_1;
            int[] nArray = new int[1];
            nArray[0] = 0;
            int[] bands = nArray;
            this.processImageUpdate(this.theImage, destX, this.destY, (int)var1_1, 1, 1, this.updateYStep, (int[])var3_4);
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

    /*
     * WARNING - void declaration
     */
    private byte[] concatenateBlocks() throws IOException {
        void var1_1;
        byte[] data = new byte[]{};
        while (true) {
            void var4_4;
            void var2_2;
            int length = this.stream.readUnsignedByte();
            if (length == 0) break;
            if (this.ignoreMetadata) {
                this.stream.skipBytes(length);
                continue;
            }
            byte[] subBlockData = \u0632\u0641.staggeredReadByteStream(this.stream, length);
            byte[] newData = new byte[data.length + length];
            System.arraycopy(data, 0, newData, 0, data.length);
            System.arraycopy(subBlockData, 0, newData, data.length, (int)var2_2);
            var1_1 = var4_4;
        }
        return var1_1;
    }

    static {
        int[] nArray = new int[5];
        nArray[0] = 8;
        nArray[1] = 8;
        nArray[2] = 4;
        nArray[3] = 2;
        nArray[4] = -1;
        interlaceIncrement = nArray;
        int[] nArray2 = new int[5];
        nArray2[0] = 0;
        nArray2[1] = 4;
        nArray2[2] = 2;
        nArray2[3] = 1;
        nArray2[4] = -1;
        interlaceOffset = nArray2;
        defaultPalette = null;
    }

    private void readHeader() throws IIOException {
        if (this.gotHeader) {
            return;
        }
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
            boolean globalColorTableFlag = (packedFields & 0x80) != 0;
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
        }
        catch (IOException iOException) {
            throw new IIOException("I/O error reading header!", iOException);
        }
        this.gotHeader = true;
    }

    /*
     * WARNING - void declaration
     */
    private ImageTypeSpecifier createIndexed(byte[] r, byte[] g, byte[] b2, int bits) {
        void var5_7;
        MultiPixelPackedSampleModel multiPixelPackedSampleModel;
        if (this.imageMetadata.transparentColorFlag) {
            int idx = Math.min(this.imageMetadata.transparentColorIndex, r.length - 1);
            colorModel = new IndexColorModel(bits, r.length, r, g, b2, idx);
        } else {
            colorModel = new IndexColorModel(bits, r.length, r, g, b2);
        }
        if (bits == 8) {
            void var7_8;
            int[] nArray = new int[1];
            nArray[0] = 0;
            int[] bandOffsets = nArray;
            PixelInterleavedSampleModel sampleModel = new PixelInterleavedSampleModel(0, 1, 1, 1, 1, (int[])var7_8);
        } else {
            multiPixelPackedSampleModel = new MultiPixelPackedSampleModel(0, 1, 1, bits);
        }
        return new ImageTypeSpecifier((ColorModel)var5_7, multiPixelPackedSampleModel);
    }

    /*
     * WARNING - void declaration
     */
    private boolean skipImage() throws IIOException {
        try {
            while (true) {
                int n;
                int length;
                int blockType;
                if ((blockType = this.stream.readUnsignedByte()) == 44) {
                    this.stream.skipBytes(8);
                    int packedFields = this.stream.readUnsignedByte();
                    if ((packedFields & 0x80) != 0) {
                        int bits = (packedFields & 7) + 1;
                        this.stream.skipBytes(3 * (1 << bits));
                    }
                    this.stream.skipBytes(1);
                    length = 0;
                    do {
                        length = this.stream.readUnsignedByte();
                        this.stream.skipBytes(length);
                    } while (length > 0);
                    return true;
                }
                if (blockType == 59) {
                    return false;
                }
                if (blockType == 33) {
                    void var3_5;
                    int label = this.stream.readUnsignedByte();
                    length = 0;
                    do {
                        length = this.stream.readUnsignedByte();
                        this.stream.skipBytes((int)var3_5);
                    } while (var3_5 > 0);
                    continue;
                }
                if (blockType == 0) {
                    return false;
                }
                boolean length2 = false;
                do {
                    n = this.stream.readUnsignedByte();
                    this.stream.skipBytes(n);
                } while (n > 0);
            }
        }
        catch (EOFException eOFException) {
            return false;
        }
        catch (IOException iOException) {
            throw new IIOException("I/O error locating image!", iOException);
        }
    }

    @Override
    public IIOMetadata getStreamMetadata() throws IIOException {
        this.readHeader();
        return this.streamMetadata;
    }

    /*
     * WARNING - void declaration
     */
    private static synchronized byte[] getDefaultPalette() {
        if (defaultPalette == null) {
            BufferedImage img = new BufferedImage(1, 1, 13);
            IndexColorModel icm = (IndexColorModel)img.getColorModel();
            int size = icm.getMapSize();
            byte[] r = new byte[size];
            byte[] g = new byte[size];
            byte[] b2 = new byte[size];
            icm.getReds(r);
            icm.getGreens(g);
            icm.getBlues(b2);
            defaultPalette = new byte[size * 3];
            int i = 0;
            while (i < size) {
                void var6_6;
                void var5_5;
                \u0630\u0626.defaultPalette[3 * i] = r[i];
                \u0630\u0626.defaultPalette[3 * i + 1] = g[i];
                \u0630\u0626.defaultPalette[3 * i + 2] = var5_5[var6_6];
                ++var6_6;
            }
        }
        return defaultPalette;
    }

    /*
     * WARNING - void declaration
     */
    private void readMetadata() throws IIOException {
        if (this.stream == null) {
            throw new IllegalStateException("Input not set!");
        }
        try {
            void var3_4;
            int blockType;
            this.imageMetadata = new a_0();
            long startPosition = this.stream.getStreamPosition();
            while (true) {
                int n;
                blockType = this.stream.readUnsignedByte();
                if (blockType == 44) {
                    this.imageMetadata.imageLeftPosition = this.stream.readUnsignedShort();
                    this.imageMetadata.imageTopPosition = this.stream.readUnsignedShort();
                    this.imageMetadata.imageWidth = this.stream.readUnsignedShort();
                    this.imageMetadata.imageHeight = this.stream.readUnsignedShort();
                    int idPackedFields = this.stream.readUnsignedByte();
                    boolean localColorTableFlag = (idPackedFields & 0x80) != 0;
                    this.imageMetadata.interlaceFlag = (idPackedFields & 0x40) != 0;
                    this.imageMetadata.sortFlag = (idPackedFields & 0x20) != 0;
                    int numLCTEntries = 1 << (idPackedFields & 7) + 1;
                    this.imageMetadata.localColorTable = (byte[])(localColorTableFlag ? \u0632\u0641.staggeredReadByteStream(this.stream, 3 * numLCTEntries) : null);
                    this.imageMetadataLength = (int)(this.stream.getStreamPosition() - startPosition);
                    return;
                }
                if (blockType != 33) break;
                int label = this.stream.readUnsignedByte();
                if (label == 249) {
                    int gceLength = this.stream.readUnsignedByte();
                    int gcePackedFields = this.stream.readUnsignedByte();
                    this.imageMetadata.disposalMethod = gcePackedFields >> 2 & 3;
                    this.imageMetadata.userInputFlag = (gcePackedFields & 2) != 0;
                    this.imageMetadata.transparentColorFlag = (gcePackedFields & 1) != 0;
                    this.imageMetadata.delayTime = this.stream.readUnsignedShort();
                    this.imageMetadata.transparentColorIndex = this.stream.readUnsignedByte();
                    int n2 = this.stream.readUnsignedByte();
                    continue;
                }
                if (label == 1) {
                    int length = this.stream.readUnsignedByte();
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
                        this.stream.skipBytes(length);
                    }
                    this.imageMetadata.text = this.concatenateBlocks();
                    continue;
                }
                if (label == 254) {
                    byte[] comment = this.concatenateBlocks();
                    if (this.ignoreMetadata) continue;
                    if (this.imageMetadata.comments == null) {
                        this.imageMetadata.comments = new ArrayList<byte[]>();
                    }
                    this.imageMetadata.comments.add(comment);
                    continue;
                }
                if (label == 255) {
                    void var10_17;
                    void var9_16;
                    int blockSize = this.stream.readUnsignedByte();
                    int offset = 0;
                    byte[] blockData = new byte[]{};
                    byte[] applicationID = new byte[8];
                    byte[] authCode = new byte[3];
                    if (!this.ignoreMetadata) {
                        blockData = \u0632\u0641.staggeredReadByteStream(this.stream, blockSize);
                        offset = this.copyData(blockData, 0, applicationID);
                        offset = this.copyData(blockData, offset, authCode);
                    } else {
                        this.stream.skipBytes(blockSize);
                    }
                    byte[] applicationData = this.concatenateBlocks();
                    if (!this.ignoreMetadata && offset < blockSize) {
                        void var11_18;
                        void var12_19;
                        int len = blockSize - offset;
                        byte[] data = new byte[len + applicationData.length];
                        System.arraycopy(blockData, offset, var12_19, 0, (int)var11_18);
                        System.arraycopy(applicationData, 0, var12_19, (int)var11_18, applicationData.length);
                        applicationData = var12_19;
                    }
                    if (this.ignoreMetadata) continue;
                    if (this.imageMetadata.applicationIDs == null) {
                        this.imageMetadata.applicationIDs = new ArrayList<byte[]>();
                        this.imageMetadata.authenticationCodes = new ArrayList<byte[]>();
                        this.imageMetadata.applicationData = new ArrayList<byte[]>();
                    }
                    this.imageMetadata.applicationIDs.add(applicationID);
                    this.imageMetadata.authenticationCodes.add((byte[])var9_16);
                    this.imageMetadata.applicationData.add((byte[])var10_17);
                    continue;
                }
                boolean length = false;
                do {
                    n = this.stream.readUnsignedByte();
                    this.stream.skipBytes(n);
                } while (n > 0);
            }
            if (blockType == 59) {
                throw new IndexOutOfBoundsException("Attempt to read past end of image sequence!");
            }
            throw new IIOException("Unexpected block type " + (int)var3_4 + "!");
        }
        catch (IIOException iIOException) {
            throw iIOException;
        }
        catch (IOException iOException) {
            throw new IIOException("I/O error reading image metadata!", iOException);
        }
    }

    private void initNext32Bits() {
        this.next32Bits = this.block[0] & 0xFF;
        this.next32Bits |= (this.block[1] & 0xFF) << 8;
        this.next32Bits |= (this.block[2] & 0xFF) << 16;
        this.next32Bits |= this.block[3] << 24;
        this.nextByte = 4;
    }

    /*
     * WARNING - void declaration
     */
    private void outputPixels(byte[] string, int len) {
        if (this.interlacePass < this.sourceMinProgressivePass || this.interlacePass > this.sourceMaxProgressivePass) {
            return;
        }
        int i = 0;
        while (i < len) {
            void var3_3;
            if (this.streamX >= this.sourceRegion.x) {
                this.rowBuf[this.streamX - this.sourceRegion.x] = string[i];
            }
            ++this.streamX;
            if (this.streamX == this.width) {
                ++this.rowsDone;
                this.processImageProgress(100.0f * (float)this.rowsDone / (float)this.height);
                if (this.abortRequested()) {
                    return;
                }
                if (this.decodeThisRow) {
                    this.outputRow();
                }
                this.streamX = 0;
                if (this.imageMetadata.interlaceFlag) {
                    this.streamY += interlaceIncrement[this.interlacePass];
                    if (this.streamY >= this.height) {
                        if (this.updateListeners != null) {
                            this.processPassComplete(this.theImage);
                        }
                        ++this.interlacePass;
                        if (this.interlacePass > this.sourceMaxProgressivePass) {
                            return;
                        }
                        this.streamY = interlaceOffset[this.interlacePass];
                        this.startPass(this.interlacePass);
                    }
                } else {
                    ++this.streamY;
                }
                this.destY = this.destinationRegion.y + (this.streamY - this.sourceRegion.y) / this.sourceYSubsampling;
                this.computeDecodeThisRow();
            }
            ++var3_3;
        }
    }

    @Override
    public void setInput(Object input, boolean seekForwardOnly, boolean ignoreMetadata) {
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

    /*
     * WARNING - void declaration
     */
    private int copyData(byte[] src, int offset, byte[] dst) {
        void var4_4;
        void var2_2;
        int len = dst.length;
        int rest = src.length - offset;
        if (len > rest) {
            len = rest;
        }
        System.arraycopy(src, offset, dst, 0, len);
        return (int)(var2_2 + var4_4);
    }

    /*
     * WARNING - void declaration
     */
    private void startPass(int pass) {
        void var5_5;
        if (this.updateListeners == null || !this.imageMetadata.interlaceFlag) {
            return;
        }
        int y = interlaceOffset[this.interlacePass];
        int yStep = interlaceIncrement[this.interlacePass];
        int[] vals = \u0632\u0641.computeUpdatedPixels(this.sourceRegion, this.destinationOffset, this.destinationRegion.x, this.destinationRegion.y, this.destinationRegion.x + this.destinationRegion.width - 1, this.destinationRegion.y + this.destinationRegion.height - 1, this.sourceXSubsampling, this.sourceYSubsampling, 0, y, this.destinationRegion.width, (this.destinationRegion.height + yStep - 1) / yStep, 1, yStep);
        this.updateMinY = vals[1];
        this.updateYStep = vals[5];
        int[] nArray = new int[1];
        nArray[0] = 0;
        int[] bands = nArray;
        this.processPassStarted(this.theImage, this.interlacePass, this.sourceMinProgressivePass, this.sourceMaxProgressivePass, 0, this.updateMinY, 1, this.updateYStep, (int[])var5_5);
    }

    private void computeDecodeThisRow() {
        this.decodeThisRow = this.destY < this.destinationRegion.y + this.destinationRegion.height && this.streamY >= this.sourceRegion.y && this.streamY < this.sourceRegion.y + this.sourceRegion.height && (this.streamY - this.sourceRegion.y) % this.sourceYSubsampling == 0;
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

