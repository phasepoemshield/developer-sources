package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.managers.SoundManager;

import org.zenith.module.JumpCircle;


public record CloudMediaEntryDto(MediaTrackInfo JumpCircle) implements CloudResponse {

   @Override
   public String type() {
      return "chat.message.received";
   }

   public MediaTrackInfo SoundManager() {
      return this.JumpCircle;
   }
}
