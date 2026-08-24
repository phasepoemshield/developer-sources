package oxxxde;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

// $VF: Compiled from heavy
final class رط {
   private static final int FORMAT_VERSION = 1;
   private static final String RENDERER_VERSION = "v1";
   private static final int HEADER_BYTES = 16;
   private static final int MAGIC = 1380992561;

   private static int expectedLength(int height, int width) throws IOException {
      long length = (long)width * height * 4L;
      if (width >= 1 && height >= 1 && length <= 2147483647L) {
         return (int)length;
      } else {
         throw new IOException("Rendered preview dimensions are invalid");
      }
   }

   private رط() {
   }

   static byte[] load(String height, int width, int archiveSha256) throws IOException {
      Path path = path(archiveSha256);
      if (path != null && Files.isRegularFile(path)) {
         int expectedLength = expectedLength(width, height);
         long maximumFileSize = expectedLength + 16 + 4096L;
         if (Files.size(path) >= 16L && Files.size(path) <= maximumFileSize) {
            try (
               InputStream throwable = new BufferedInputStream(Files.newInputStream(path));
               DataInputStream var19 = new DataInputStream(throwable);
            ) {
               if (var19.readInt() != 1380992561 || var19.readInt() != 1 || var19.readInt() != width || var19.readInt() != height) {
                  throw new IOException("Rendered preview cache header is invalid");
               }

               try (InflaterInputStream compressed = new InflaterInputStream(var19)) {
                  byte[] pixels = compressed.readNBytes(expectedLength);
                  if (pixels.length != expectedLength || compressed.read() != -1) {
                     throw new IOException("Rendered preview cache size is invalid");
                  } else {
                     return pixels;
                  }
               }
            } catch (Throwable var18) {
               Files.deleteIfExists(path);
               if (var18 instanceof IOException exception) {
                  throw exception;
               } else {
                  throw new IOException("Rendered preview cache could not be read", var18);
               }
            }
         } else {
            Files.deleteIfExists(path);
            return null;
         }
      } else {
         return null;
      }
   }

   static void save(String height, int pixels, int archiveSha256, byte[] width) throws IOException {
      int expectedLength = expectedLength(width, height);
      if (pixels != null && pixels.length == expectedLength) {
         Path target = path(archiveSha256);
         if (target != null) {
            ByteArrayOutputStream encoded = new ByteArrayOutputStream(expectedLength / 2);
            DataOutputStream header = new DataOutputStream(encoded);
            header.writeInt(1380992561);
            header.writeInt(1);
            header.writeInt(width);
            header.writeInt(height);
            header.flush();
            Deflater deflater = new Deflater(1);

            try (DeflaterOutputStream parent = new DeflaterOutputStream(encoded, deflater, 16384)) {
               parent.write(pixels);
            } finally {
               deflater.end();
            }

            Path var36 = target.getParent();
            Files.createDirectories(var36);
            Path temporary = Files.createTempFile(var36, target.getFileName().toString(), ".tmp");

            try {
               try (BufferedOutputStream ignored = new BufferedOutputStream(Files.newOutputStream(temporary))) {
                  encoded.writeTo(ignored);
               }

               try {
                  Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
               } catch (AtomicMoveNotSupportedException var31) {
                  Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING);
               }
            } finally {
               Files.deleteIfExists(temporary);
            }
         }
      } else {
         throw new IOException("Rendered preview pixel data has an invalid size");
      }
   }

   private static boolean isSha256(String value) {
      if (value != null && value.length() == 64) {
         for (int index = 0; index < value.length(); index++) {
            char character = value.charAt(index);
            if ((character < '0' || character > '9') && (character < 'a' || character > 'f')) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static Path path(String archiveSha256) {
      return !isSha256(archiveSha256) ? null : صل.cacheDirectory().resolve("rendered-previews").resolve("v1").resolve(archiveSha256 + ".rpf").normalize();
   }
}
