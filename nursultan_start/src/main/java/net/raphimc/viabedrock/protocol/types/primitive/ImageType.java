/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.primitive;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.awt.image.BufferedImage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ImageType
extends Type<BufferedImage> {
    public ImageType() {
        super(BufferedImage.class);
    }

    public void write(ByteBuf buffer, BufferedImage value) {
        if (value == null) {
            buffer.writeIntLE(0);
            buffer.writeIntLE(0);
            BedrockTypes.BYTE_ARRAY.write(buffer, (Object)new byte[0]);
            return;
        }
        buffer.writeIntLE(value.getWidth());
        buffer.writeIntLE(value.getHeight());
        BedrockTypes.BYTE_ARRAY.write(buffer, (Object)ImageType.getImageData(value));
    }

    public BufferedImage read(ByteBuf buffer) {
        int width = buffer.readIntLE();
        int height = buffer.readIntLE();
        byte[] data = (byte[])BedrockTypes.BYTE_ARRAY.read(buffer);
        if (width <= 0 || height <= 0 || data.length == 0 || data.length != width * height * 4) {
            return null;
        }
        BufferedImage image = new BufferedImage(width, height, 2);
        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                int index = (y * width + x) * 4;
                int argb = (data[index + 3] & 0xFF) << 24 | (data[index] & 0xFF) << 16 | (data[index + 1] & 0xFF) << 8 | data[index + 2] & 0xFF;
                image.setRGB(x, y, argb);
            }
        }
        return image;
    }

    public static byte[] getImageData(BufferedImage image) {
        byte[] data = new byte[image.getWidth() * image.getHeight() * 4];
        for (int y = 0; y < image.getHeight(); ++y) {
            for (int x = 0; x < image.getWidth(); ++x) {
                int argb = image.getRGB(x, y);
                int index = (y * image.getWidth() + x) * 4;
                data[index] = (byte)(argb >> 16 & 0xFF);
                data[index + 1] = (byte)(argb >> 8 & 0xFF);
                data[index + 2] = (byte)(argb & 0xFF);
                data[index + 3] = (byte)(argb >> 24 & 0xFF);
            }
        }
        return data;
    }
}

