package org.zenith.core;

import org.zenith.event.EventRender;

import com.google.gson.JsonObject;
import java.util.Objects;

public record CloudStatEntryDto(String string46, long long108, JsonObject jsonObject3) {

   public CloudStatEntryDto(String string46, long long108, JsonObject jsonObject3) {
      Objects.requireNonNull(string46, "userId");
      jsonObject3 = jsonObject3.deepCopy();
      this.string46 = string46;
      this.long108 = long108;
      this.jsonObject3 = jsonObject3;
   }

   public String userId() {
      return this.string46;
   }

   public long EventRender() {
      return this.long108;
   }

   public JsonObject MenuEaseA() {
      return this.jsonObject3;
   }
}
