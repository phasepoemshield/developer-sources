package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.render.WorldRender;

import org.zenith.module.AimAssist;
import org.zenith.module.AntiBot;
import org.zenith.module.Aura;
import org.zenith.module.AutoExplosion;
import org.zenith.module.AutoSwap;
import org.zenith.module.AutoTotem;



import java.util.List;

public record CloudFriendsDto(String WorldRender, long long107, int int150, boolean boolean111, List<CloudFriendDto> list49, List<CloudRelationDto> list50, List<CloudRelationDto> list51) implements CloudResponse {

   public CloudFriendsDto(
      String WorldRender,
      long long107,
      int int150,
      boolean boolean111,
      List<CloudFriendDto> list49,
      List<CloudRelationDto> list50,
      List<CloudRelationDto> list51
   ) {
      list49 = List.copyOf(list49);
      list50 = List.copyOf(list50);
      list51 = List.copyOf(list51);
      this.WorldRender = WorldRender;
      this.long107 = long107;
      this.int150 = int150;
      this.boolean111 = boolean111;
      this.list49 = list49;
      this.list50 = list50;
      this.list51 = list51;
   }

   @Override
   public String type() {
      return "friends.snapshot";
   }

   public String AimAssist() {
      return this.WorldRender;
   }

   public long AntiBot() {
      return this.long107;
   }

   public int Aura() {
      return this.int150;
   }

   public boolean AutoExplosion() {
      return this.boolean111;
   }

   public List<CloudFriendDto> friends() {
      return this.list49;
   }

   public List<CloudRelationDto> AutoSwap() {
      return this.list50;
   }

   public List<CloudRelationDto> AutoTotem() {
      return this.list51;
   }
}
