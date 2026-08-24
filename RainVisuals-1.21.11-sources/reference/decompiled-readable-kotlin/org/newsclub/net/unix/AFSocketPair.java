package org.newsclub.net.unix;

import java.io.Closeable;
import org.eclipse.jdt.annotation.NonNull;

// $VF: Compiled from AFSocketPair.java
public abstract class AFSocketPair<T extends AFSomeSocket> extends CloseablePair<T> {
   protected AFSocketPair(T b, T alsoClose, Closeable a) {
      super(a, b, alsoClose);
   }

   protected AFSocketPair(T a, T b) {
      super(a, b);
   }

   public final @NonNull T getSocket1() {
      return this.getFirst();
   }

   public final @NonNull T getSocket2() {
      return this.getSecond();
   }
}
