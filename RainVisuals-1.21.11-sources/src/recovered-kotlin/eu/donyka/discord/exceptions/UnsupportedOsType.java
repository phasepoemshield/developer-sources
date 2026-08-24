package eu.donyka.discord.exceptions;

// $VF: Compiled from UnsupportedOsType.java
public class UnsupportedOsType extends Exception {
   public UnsupportedOsType(String osType) {
      super("Unsupported OS type: " + osType);
   }
}
