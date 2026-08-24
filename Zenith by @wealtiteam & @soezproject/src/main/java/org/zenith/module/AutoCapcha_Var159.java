package org.zenith.module;

import net.minecraft.client.network.ClientPlayNetworkHandler;

record AutoCapcha_Var159(ClientPlayNetworkHandler clientPlayNetworkHandler, String string42) {

   public boolean isConnected() {
      return this.clientPlayNetworkHandler != null && this.clientPlayNetworkHandler.getConnection().isOpen();
   }

   public ClientPlayNetworkHandler int348() {
      return this.clientPlayNetworkHandler;
   }

   public String label() {
      return this.string42;
   }
}
