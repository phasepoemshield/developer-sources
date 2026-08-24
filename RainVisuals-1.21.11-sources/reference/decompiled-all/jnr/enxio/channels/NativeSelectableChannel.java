package jnr.enxio.channels;

import java.nio.channels.Channel;

// $VF: Compiled from NativeSelectableChannel.java
public interface NativeSelectableChannel extends Channel {
   int getFD();
}
