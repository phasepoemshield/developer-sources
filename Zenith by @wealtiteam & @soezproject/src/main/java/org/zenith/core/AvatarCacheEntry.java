package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.ElytraHelper;


import java.nio.file.Path;

record AvatarCacheEntry(Path path, AvatarKind zClass024Var159, long long88) {

   public Path path() {
      return this.path;
   }

   public AvatarKind vec3d37() {
      return this.zClass024Var159;
   }

   public long ElytraHelper() {
      return this.long88;
   }
}
