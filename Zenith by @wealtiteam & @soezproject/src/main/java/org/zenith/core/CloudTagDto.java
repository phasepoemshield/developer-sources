package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.KillEffect;


public record CloudTagDto(String KillEffect) {

   public String ServerTheme() {
      return this.KillEffect;
   }
}
