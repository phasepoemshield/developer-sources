package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.managers.SoundManager;

import org.zenith.module.Interface;


public record CloudMediaDto(MediaTrackInfo Interface) implements CloudResponse {

   @Override
   public String type() {
      return "chat.message.accepted";
   }

   public MediaTrackInfo SoundManager() {
      return this.Interface;
   }
}
