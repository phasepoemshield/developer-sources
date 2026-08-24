package eu.donyka.discord.connection;

import eu.donyka.discord.DiscordRPC;
import eu.donyka.discord.exceptions.NoDiscordClientException;
import eu.donyka.discord.exceptions.PipeAccessDenied;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

// $VF: Compiled from WindowsConnection.java
class WindowsConnection extends BaseConnection {
   private RandomAccessFile pipe = null;
   private boolean opened = false;

   @Override
   void close() {
      if (this.isOpen()) {
         try {
            this.pipe.close();
         } catch (Exception var2) {
         }

         this.opened = false;
      }
   }

   @Override
   boolean open() throws NoDiscordClientException, PipeAccessDenied {
      String pipeName = "\\\\.\\pipe\\discord-ipc-%d";
      if (this.isOpen()) {
         throw new IllegalStateException("Connection is already opened");
      }

      for (int i = 0; i < 10; i++) {
         String pipePath = String.format(pipeName, i);

         try {
            if (new File(pipePath).exists()) {
               this.pipe = new RandomAccessFile(pipePath, "rw");
               this.opened = true;
               return true;
            }
         } catch (FileNotFoundException var5) {
            if (var5.getMessage() != null && var5.getMessage().toLowerCase().contains("access is denied")) {
               throw new PipeAccessDenied(
                  "Cannot access pipe " + String.format(pipeName, i) + " due to permission errors. Ensure discord is NOT running in administrator mode!"
               );
            }
         } catch (SecurityException var6) {
            throw new PipeAccessDenied("Failed to open RPC Connection, with error Access Denied. Is Discord running in Administrator mode?");
         }
      }

      throw new NoDiscordClientException();
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
         long e = this.pipe.length() - this.pipe.getFilePointer();
         if (e < length) {
            return false;
         } else {
            int read = this.pipe.read(bytes, 0, length);
            if (read != length) {
               throw new IOException("Read less data than supplied. Expected: " + length + ". Got: " + read);
            } else {
               return true;
            }
         }
      } catch (IOException var6) {
         this.close();
         return false;
      }
   }

   @Override
   public void register(String command, String applicationId) {
      String javaLibraryPath = System.getProperty("java.home");
      File javaExeFile = new File(javaLibraryPath.split(";")[0] + "/bin/java.exe");
      File javawExeFile = new File(javaLibraryPath.split(";")[0] + "/bin/javaw.exe");
      String javaExePath = javaExeFile.exists() ? javaExeFile.getAbsolutePath() : (javawExeFile.exists() ? javawExeFile.getAbsolutePath() : null);
      if (javaExePath == null) {
         throw new RuntimeException("Unable to find java path");
      }

      String openCommand;
      if (command != null) {
         openCommand = command;
      } else {
         openCommand = javaExePath;
      }

      String protocolName = "discord-" + applicationId;
      String protocolDescription = "URL:Run game " + applicationId + " protocol";
      String keyName = "Software\\Classes\\" + protocolName;
      String iconKeyName = keyName + "\\DefaultIcon";
      String commandKeyName = keyName + "\\DefaultIcon";

      try {
         WinRegistry.createKey(keyName);
         WinRegistry.writeStringValue(keyName, "", protocolDescription);
         WinRegistry.writeStringValue(keyName, "URL Protocol", "\u0000");
         WinRegistry.createKey(iconKeyName);
         WinRegistry.writeStringValue(iconKeyName, "", javaExePath);
         WinRegistry.createKey(commandKeyName);
         WinRegistry.writeStringValue(commandKeyName, "", openCommand);
      } catch (Exception var14) {
         throw new RuntimeException("Unable to modify Discord registry keys", var14);
      }
   }

   @Override
   boolean write(byte[] bytes) {
      if (!this.isOpen()) {
         return false;
      }

      try {
         this.pipe.write(bytes);
         return true;
      } catch (Exception var3) {
         return false;
      }
   }

   WindowsConnection(DiscordRPC rpc) {
      super(rpc);
   }

   @Override
   boolean isOpen() {
      return this.opened;
   }

   @Override
   public void registerSteamGame(String steamId, String applicationId) {
      try {
         String steamPath = WinRegistry.readString();
         if (steamPath == null) {
            throw new RuntimeException("Steam exe path not found");
         }

         steamPath = steamPath.replaceAll("/", "\\");
         String command = "\"" + steamPath + "\" steam://rungameid/" + steamId;
         this.register(applicationId, command);
      } catch (Exception var5) {
         throw new RuntimeException("Unable to register Steam game", var5);
      }
   }
}
