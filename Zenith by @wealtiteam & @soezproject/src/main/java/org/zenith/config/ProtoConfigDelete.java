package org.zenith.config;

import org.zenith.core.ItemRegistry;

import org.zenith.core.PermissionListCodec;
import org.zenith.core.TaskQueue;

import org.zenith.util.I11IType;

import com.google.gson.JsonObject;
import java.util.Objects;
import java.util.UUID;

public record ProtoConfigDelete(UUID I11IType) implements ProtocolMessage {

   public ProtoConfigDelete(UUID I11IType) {
      Objects.requireNonNull(I11IType, "configId");
      this.I11IType = I11IType;
   }

   @Override
   public String type() {
      return "config.delete";
   }

   @Override
   public JsonObject TaskQueue() {
      return ConfigJsonUtil.ItemRegistry("configId", this.I11IType.toString());
   }

   public UUID PermissionListCodec() {
      return this.I11IType;
   }
}
