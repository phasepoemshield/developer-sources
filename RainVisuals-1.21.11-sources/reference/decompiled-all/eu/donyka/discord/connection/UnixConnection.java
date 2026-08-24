package eu.donyka.discord.connection;

import eu.donyka.discord.DiscordRPC;
import eu.donyka.discord.connection.unix.IUnixBackend;
import eu.donyka.discord.connection.unix.JUnixBackend;
import eu.donyka.discord.exceptions.NoDiscordClientException;
import eu.donyka.discord.exceptions.PipeAccessDenied;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

// $VF: Compiled from UnixConnection.java
class UnixConnection extends BaseConnection {
   private IUnixBackend unixBackend = new JUnixBackend();

   @Override
   void close() {
      if (this.isOpen()) {
         try {
            this.unixBackend.closePipe();
         } catch (IOException var2) {
         }
      }
   }

   @Override
   boolean read(byte[] length, int bytes) {
      if (bytes == null || bytes.length == 0) {
         return bytes != null;
      }

      if (!this.isOpen()) {
         return false;
      }

      try {
         int e = this.unixBackend.getAvailable();
         if (e < length) {
            return false;
         }

         byte[] buf = new byte[length];
         int read = this.unixBackend.read(buf);
         if (read != length) {
            throw new IOException("Read less data than supplied. Expected: " + length + ". Got: " + read);
         }

         ByteBuffer buffer = ByteBuffer.wrap(buf);
         ((Buffer)buffer).rewind();
         buffer.get(bytes, 0, length);
         return true;
      } catch (Exception var7) {
         this.close();
         return false;
      }
   }

   private String getTempPath() {
      String temp = System.getenv("XDG_RUNTIME_DIR");
      temp = temp != null ? temp : System.getenv("TMPDIR");
      temp = temp != null ? temp : System.getenv("TMP");
      temp = temp != null ? temp : System.getenv("TEMP");
      return temp != null ? temp : "/tmp";
   }

   private String getAdditionalPaths() {
      String[] unixFolderPaths = new String[]{"/snap.discord", "/app/com.discordapp.Discord"};
      String path = this.getTempPath();

      for (String s : unixFolderPaths) {
         File f = new File(path, s);
         if (f.exists() && f.isDirectory() && f.list() != null && f.list().length > 0) {
            return f.getAbsolutePath();
         }
      }

      return null;
   }

   @Override
   public void registerSteamGame(String steamId, String applicationId) {
      this.register(applicationId, "xdg-open steam://rungameid/" + steamId);
   }

   @Override
   public void register(String applicationId, String command) {
      String home = System.getenv("HOME");
      if (home == null) {
         throw new RuntimeException("Unable to find user HOME directory");
      }

      if (command == null) {
         try {
            command = Files.readSymbolicLink(Paths.get("/proc/self/exe")).toString();
         } catch (Exception var22) {
            throw new RuntimeException("Unable to get current exe path from /proc/self/exe", var22);
         }
      }

      String desktopFile = "[Desktop Entry]\nName=Game "
         + applicationId
         + "\nExec="
         + command
         + " %%u\nType=Application\nNoDisplay=true\nCategories=Discord;Games;\nMimeType=x-scheme-handler/discord-"
         + applicationId
         + ";\n";
      String desktopFileName = "/discord-" + applicationId + ".desktop";
      String desktopFilePath = home + "/.local";
      if (!this.mkdir(desktopFilePath)) {
         throw new RuntimeException("Failed to create directory '" + desktopFilePath + "'");
      }

      desktopFilePath = desktopFilePath + "/share";
      if (!this.mkdir(desktopFilePath)) {
         throw new RuntimeException("Failed to create directory '" + desktopFilePath + "'");
      }

      desktopFilePath = desktopFilePath + "/applications";
      if (!this.mkdir(desktopFilePath)) {
         throw new RuntimeException("Failed to create directory '" + desktopFilePath + "'");
      }

      desktopFilePath = desktopFilePath + desktopFileName;

      try (FileWriter xdgMimeCommand = new FileWriter(desktopFilePath)) {
         xdgMimeCommand.write(desktopFile);
      } catch (Exception var24) {
         throw new RuntimeException("Failed to write desktop info into '" + desktopFilePath + "'");
      }

      String var28 = "xdg-mime default discord-" + applicationId + ".desktop x-scheme-handler/discord-" + applicationId;

      try {
         ProcessBuilder var29 = new ProcessBuilder(var28.split(" "));
         var29.environment();
         int result = var29.start().waitFor();
         if (result < 0) {
            throw new Exception("xdg-mime returned " + result);
         }
      } catch (Exception var20) {
         throw new RuntimeException("Failed to register mime handler", var20);
      }
   }

   boolean mkdir(String path) {
      File file = new File(path);
      return file.exists() && file.isDirectory() || file.mkdir();
   }

   UnixConnection(DiscordRPC rpc) {
      super(rpc);
   }

   @Override
   boolean isOpen() {
      return this.unixBackend != null && this.unixBackend.isConnected();
   }

   private boolean tryOpenConnection(String pipeName) {
      for (int i = 0; i < 10; i++) {
         try {
            File test = new File(String.format(pipeName, i));
            if (test.exists()) {
               this.unixBackend.openPipe(String.format(pipeName, i));
               return true;
            }
         } catch (Exception var4) {
         }
      }

      return false;
   }

   @Override
   boolean open() throws NoDiscordClientException, PipeAccessDenied {
      String pipeName = this.getTempPath() + "/discord-ipc-%s";
      if (this.isOpen()) {
         throw new IllegalStateException("Connection is already opened");
      } else if (this.tryOpenConnection(pipeName)) {
         return true;
      } else {
         String nextPath = this.getAdditionalPaths();
         if (nextPath != null && !nextPath.isEmpty() && this.tryOpenConnection(nextPath + "/discord-ipc-%s")) {
            return true;
         } else {
            throw new NoDiscordClientException();
         }
      }
   }

   @Override
   boolean write(byte[] bytes) {
      if (!this.isOpen()) {
         return false;
      }

      try {
         this.unixBackend.write(bytes);
         return true;
      } catch (Exception var3) {
         return false;
      }
   }
}
