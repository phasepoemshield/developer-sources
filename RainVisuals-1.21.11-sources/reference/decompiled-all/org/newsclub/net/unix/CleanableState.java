package org.newsclub.net.unix;

import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.Cleaner;
import java.lang.ref.Cleaner.Cleanable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

// $VF: Compiled from CleanableState.java
@IgnoreJRERequirement
abstract class CleanableState implements Closeable {
   private static final Cleaner CLEANER = Cleaner.create();
   private final Cleanable cleanable;

   protected CleanableState(Object observed) {
      this.cleanable = CLEANER.register(observed, () -> this.doClean());
   }

   public final void runCleaner() {
      this.cleanable.clean();
   }

   protected abstract void doClean();

   @Override
   public final void close() throws IOException {
      this.runCleaner();
   }
}
