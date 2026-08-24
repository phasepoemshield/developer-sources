package oxxxde

import kotakbaz.rain.client.liteapi.HolyWorldFeatureControl
import net.minecraft.network.RegistryByteBuf
import net.minecraft.network.codec.PacketCodec
import net.minecraft.network.packet.CustomPayload.Id

// $VF: Compiled from heavy
public companion object ف {
   fun getCODEC(): PacketCodec<RegistryByteBuf, HolyWorldFeatureControl.LiteApiPayload> {
      HolyWorldFeatureControl.LiteApiPayload.access$getCODEC$cp()
   }

   fun getID(): Id<HolyWorldFeatureControl.LiteApiPayload> {
      HolyWorldFeatureControl.LiteApiPayload.access$getID$cp()
   }
}
