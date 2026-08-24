package org.newsclub.net.unix;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

// $VF: Compiled from BuildProperties.java
final class BuildProperties {
   private static final Map<String, String> MAP;

   private BuildProperties() {
      throw new IllegalStateException("No instances");
   }

   static Map<String, String> getBuildProperties() {
      return MAP;
   }

   static {
      Map<String, String> map = new LinkedHashMap<>();
      map.put("project.version", "2.9.1");
      map.put("git.build.version", "2.9.1");
      map.put("git.commit.id.abbrev", "7c5315d");
      map.put("git.commit.id.describe", "7c5315d");
      map.put("git.commit.id.full", "7c5315d7dbad93cc9e2c21878146cf608e885a1f");
      map.put("git.commit.time", "2024-04-05T16:23:29+02:00");
      map.put("git.dirty", "false");
      MAP = Collections.unmodifiableMap(map);
   }
}
