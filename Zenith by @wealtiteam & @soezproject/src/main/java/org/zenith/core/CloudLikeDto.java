package org.zenith.core;

import org.zenith.util.TextReplaceUtils;
import org.zenith.util.TextUtils;



import java.util.Objects;
import java.util.UUID;

public record CloudLikeDto(UUID PacketDispatcher, boolean TextUtils, long TextReplaceUtils) implements CloudResponse {

   public CloudLikeDto(UUID PacketDispatcher, boolean TextUtils, long TextReplaceUtils) {
      Objects.requireNonNull(PacketDispatcher, "configId");
      if (TextReplaceUtils < 0L) {
         throw new IllegalArgumentException("likeCount must be non-negative");
      } else {
         this.PacketDispatcher = PacketDispatcher;
         this.TextUtils = TextUtils;
         this.TextReplaceUtils = TextReplaceUtils;
      }
   }

   @Override
   public String type() {
      return "config.like.result";
   }

   public UUID PermissionListCodec() {
      return this.PacketDispatcher;
   }

   public boolean HudArmorPanel() {
      return this.TextUtils;
   }

   public long HudSelectedItemPanel() {
      return this.TextReplaceUtils;
   }
}
