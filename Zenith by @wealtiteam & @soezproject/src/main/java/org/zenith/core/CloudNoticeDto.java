package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Chams;


import java.util.Objects;

public record CloudNoticeDto(String Chams) implements CloudResponse {

   public CloudNoticeDto(String Chams) {
      Objects.requireNonNull(Chams, "answer");
      this.Chams = Chams;
   }

   @Override
   public String type() {
      return "captcha.solved";
   }

   public String RemoteEventsPoller() {
      return this.Chams;
   }
}
