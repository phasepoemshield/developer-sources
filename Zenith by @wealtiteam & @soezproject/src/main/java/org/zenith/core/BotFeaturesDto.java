package org.zenith.core;

import org.zenith.module.Module;
import org.zenith.rotation.Rotation;

import org.zenith.rotation.RotationEasingBase;

import org.zenith.module.BaseFinder;
import org.zenith.module.Bot;
import org.zenith.module.ClanUpgrade;
import org.zenith.module.CropFarmer;
import org.zenith.module.WarpFarm;

import org.zenith.base.figura.utils.Version;













import com.google.gson.JsonObject;
import java.util.Objects;
import java.util.UUID;

public record BotFeaturesDto(int BaseFinder, UUID Bot, UUID ClanUpgrade, CloudResponse CropFarmer, JsonObject WarpFarm) {

   public BotFeaturesDto(int BaseFinder, UUID Bot, UUID ClanUpgrade, CloudResponse CropFarmer, JsonObject WarpFarm) {
      Objects.requireNonNull(Bot, "id");
      Objects.requireNonNull(CropFarmer, "packet");
      WarpFarm = Objects.requireNonNull(WarpFarm, "payload").deepCopy();
      this.BaseFinder = BaseFinder;
      this.Bot = Bot;
      this.ClanUpgrade = ClanUpgrade;
      this.CropFarmer = CropFarmer;
      this.WarpFarm = WarpFarm;
   }

   public String type() {
      return this.CropFarmer.type();
   }

   public boolean MenuEaseF() {
      return this.ClanUpgrade != null;
   }

   public int version() {
      return this.BaseFinder;
   }

   public UUID id() {
      return this.Bot;
   }

   public UUID RotationEasingBase() {
      return this.ClanUpgrade;
   }

   public CloudResponse BotActivity() {
      return this.CropFarmer;
   }

   public JsonObject TaskQueue() {
      return this.WarpFarm;
   }
}
