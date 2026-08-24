/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package eu.donyka.discord.models;

import eu.donyka.discord.enums.OpCode;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import lombok.Generated;

public class MessageFrame {
    byte[] messageBuffer;
    private int length;
    private OpCode opCode;
    private String message;
    byte[] headerBuffer = new byte[8];

    @Generated
    public byte[] getMessageBuffer() {
        return this.messageBuffer;
    }

    @Generated
    public byte[] getHeaderBuffer() {
        return this.headerBuffer;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public void setOpCode(OpCode opCode) {
        this.opCode = opCode;
    }

    @Generated
    public int getLength() {
        return this.length;
    }

    public MessageFrame() {
        this.messageBuffer = new byte[65535 - this.headerBuffer.length];
    }

    public boolean parseMessage() {
        this.message = new String(Arrays.copyOfRange(this.messageBuffer, 0, this.length), StandardCharsets.UTF_8);
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private int readInt(InputStream stream) throws IOException {
        void var2_2;
        int ch1 = stream.read();
        int ch2 = stream.read();
        int ch3 = stream.read();
        int ch4 = stream.read();
        if ((ch1 | ch2 | ch3 | ch4) < 0) {
            throw new EOFException();
        }
        return (ch4 << 24) + (ch3 << 16) + (ch2 << 8) + var2_2;
    }

    @Generated
    public OpCode getOpCode() {
        return this.opCode;
    }

    /*
     * WARNING - void declaration
     */
    public ByteBuffer write() {
        void var2_2;
        byte[] d = this.message.getBytes(StandardCharsets.UTF_8);
        ByteBuffer writeStream = ByteBuffer.allocate(d.length + 8);
        writeStream.putInt(Integer.reverseBytes(this.opCode.ordinal()));
        writeStream.putInt(Integer.reverseBytes(d.length));
        writeStream.put(d);
        writeStream.rewind();
        return var2_2;
    }

    public MessageFrame(OpCode code, String message) {
        this();
        this.opCode = code;
        this.message = message;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    public boolean parseHeader() {
        boolean bl;
        Throwable throwable;
        ByteArrayInputStream inputStream;
        block15: {
            inputStream = new ByteArrayInputStream(this.headerBuffer);
            throwable = null;
            this.opCode = OpCode.values()[this.readInt(inputStream)];
            this.length = this.readInt(inputStream);
            bl = true;
            if (inputStream == null) break block15;
            if (throwable != null) {
                try {
                    inputStream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                break block15;
            }
            inputStream.close();
        }
        return bl;
        {
            catch (Throwable throwable3) {
                try {
                    try {
                        throwable = throwable3;
                        throw throwable3;
                    }
                    catch (Throwable throwable4) {
                        if (inputStream != null) {
                            if (throwable != null) {
                                try {
                                    inputStream.close();
                                }
                                catch (Throwable throwable5) {
                                    throwable.addSuppressed(throwable5);
                                }
                            } else {
                                void var1_1;
                                var1_1.close();
                            }
                        }
                        throw throwable4;
                    }
                }
                catch (IOException iOException) {
                    return false;
                }
            }
        }
    }
}

