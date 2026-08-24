package eu.donyka.discord.utils;

// $VF: Compiled from OSDetector.java
public class OSDetector {
   public static final OSDetector INSTANCE = new OSDetector();

   public OSDetector.OSType detectOs() {
      String osName = System.getProperty("os.name").toLowerCase();
      if (osName.contains("win")) {
         return OSDetector.OSType.WINDOWS;
      } else if (osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) {
         return OSDetector.OSType.LINUX;
      } else {
         return osName.contains("mac") ? OSDetector.OSType.MACOS : OSDetector.OSType.UNKNOWN;
      }
   }

   // $VF: Compiled from OSDetector.java
   public enum OSType {
      WINDOWS,
      UNKNOWN,
      MACOS,
      LINUX;

      public boolean isWindows() {
         return this == WINDOWS;
      }

      public boolean isLinux() {
         return this == LINUX;
      }

      public boolean isMac() {
         return this == MACOS;
      }
   }
}
