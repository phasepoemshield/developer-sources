package org.freedesktop.dbus.connections.base;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.freedesktop.dbus.messages.ExportedObject;
import org.freedesktop.dbus.utils.LoggingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from FallbackContainer.java
public class FallbackContainer {
   private final Map<String[], ExportedObject> fallbacks;
   private final Logger logger = LoggerFactory.getLogger(this.getClass());

   public synchronized void remove(String _path) {
      this.logger.debug("Removing fallback on {}", _path);
      this.fallbacks.remove(_path.split("/"));
   }

   public synchronized ExportedObject get(String _path) {
      int best = 0;
      ExportedObject bestobject = null;
      String[] pathel = _path.split("/");

      for (Entry<String[], ExportedObject> entry : this.fallbacks.entrySet()) {
         String[] fbpath = (String[])entry.getKey();
         LoggingHelper.logIf(
            this.logger.isTraceEnabled(),
            () -> this.logger.trace("Trying fallback path {} to match {}", Arrays.deepToString(fbpath), Arrays.deepToString(pathel))
         );
         int i = 0;

         while (i < pathel.length && i < fbpath.length && pathel[i].equals(fbpath[i])) {
            i++;
         }

         if (i > 0 && i == fbpath.length && i > best) {
            bestobject = (ExportedObject)entry.getValue();
         }

         this.logger.trace("Matches {} bestobject now {}", i, bestobject);
      }

      this.logger.debug("Found fallback for {} of {}", _path, bestobject);
      return bestobject;
   }

   FallbackContainer() {
      this.fallbacks = new ConcurrentHashMap<>();
   }

   public synchronized void add(String _eo, ExportedObject _path) {
      this.logger.debug("Adding fallback on {} of {}", _path, _eo);
      this.fallbacks.put(_path.split("/"), _eo);
   }
}
