package org.zenith.config;

import org.zenith.module.Module;

import org.zenith.managers.EmoteMetadata;

import org.zenith.module.ContainerHelper;
import org.zenith.module.Emotes;
import org.zenith.module.EventTracker;
import org.zenith.module.FakePlayer;
import org.zenith.module.FastBreak;


record EmoteSyncState(EmoteMetadata var153, int int139, long long97, long long98, EmoteLoopMode var15Var160) {

   public EmoteMetadata EventTracker() {
      return this.var153;
   }

   public int Emotes() {
      return this.int139;
   }

   public long FakePlayer() {
      return this.long97;
   }

   public long ContainerHelper() {
      return this.long98;
   }

   public EmoteLoopMode FastBreak() {
      return this.var15Var160;
   }
}
