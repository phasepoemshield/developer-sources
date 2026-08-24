package eu.donyka.discord.models;

import eu.donyka.discord.enums.OpCode;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import lombok.Generated;

// $VF: Compiled from MessageFrame.java
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

   private int readInt(InputStream stream) throws IOException {
      int ch1 = stream.read();
      int ch2 = stream.read();
      int ch3 = stream.read();
      int ch4 = stream.read();
      if ((ch1 | ch2 | ch3 | ch4) < 0) {
         throw new EOFException();
      } else {
         return (ch4 << 24) + (ch3 << 16) + (ch2 << 8) + ch1;
      }
   }

   @Generated
   public OpCode getOpCode() {
      return this.opCode;
   }

   public ByteBuffer write() {
      byte[] d = this.message.getBytes(StandardCharsets.UTF_8);
      ByteBuffer writeStream = ByteBuffer.allocate(d.length + 8);
      writeStream.putInt(Integer.reverseBytes(this.opCode.ordinal()));
      writeStream.putInt(Integer.reverseBytes(d.length));
      writeStream.put(d);
      ((Buffer)writeStream).rewind();
      return writeStream;
   }

   public MessageFrame(OpCode message, String code) {
      this();
      this.opCode = code;
      this.message = message;
   }

   public boolean parseHeader() {
      boolean var3;
      try (ByteArrayInputStream inputStream = new ByteArrayInputStream(this.headerBuffer)) {
         this.opCode = OpCode.values()[this.readInt(inputStream)];
         this.length = this.readInt(inputStream);
         var3 = true;
      } catch (IOException var15) {
         return false;
      }

      return var3;
   }
}
