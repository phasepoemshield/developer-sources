package org.zenith.base.bot.net;

import org.zenith.module.Bot;

import org.zenith.base.bot.world.BotPlayer;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;














import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.command.CommandSource;
import net.minecraft.command.CommandSource.SuggestedIdType;
import net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket;
import net.minecraft.network.packet.s2c.play.ChatSuggestionsS2CPacket.Action;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public final class BotCommandSource implements CommandSource {
   public final BotPlayHandler handler;
   public int completionId = -1;
   public CompletableFuture<Suggestions> pendingCommandCompletion;
   public final Set<String> chatSuggestions = new HashSet<>();

   BotCommandSource(BotPlayHandler var1) {
      this.handler = var1;
   }

   @Override
   public Collection<String> getPlayerNames() {
      Collection<String> arraylist = new ArrayList<>();

      for (PlayerListEntry playerlistentry : this.handler.getPlayerList()) {
         arraylist.add(playerlistentry.getProfile().getName());
      }

      return arraylist;
   }

   @Override
   public synchronized Collection<String> getChatSuggestions() {
      if (this.chatSuggestions.isEmpty()) {
         return this.getPlayerNames();
      } else {
         var hashset = new HashSet(this.getPlayerNames());
         hashset.addAll(this.chatSuggestions);
         return hashset;
      }
   }

   @Override
   public Collection<String> getTeamNames() {
      return this.handler.getScoreboard().getTeamNames();
   }

   @Override
   public Stream<Identifier> getSoundIds() {
      return Registries.SOUND_EVENT.getIds().stream();
   }

   @Override
   public boolean hasPermissionLevel(int level) {
      BotPlayer botplayer = this.handler.getPlayer();
      return botplayer != null ? botplayer.hasPermissionLevel(level) : level == 0;
   }

   @Override
   public CompletableFuture<Suggestions> listIdSuggestions(
      RegistryKey<? extends Registry<?>> registryRef, SuggestedIdType suggestedIdType, SuggestionsBuilder builder, CommandContext<?> context
   ) {
      return this.getRegistryManager().getOptional(registryRef).map(var3 -> {
         this.suggestIdentifiers((Registry<?>)var3, suggestedIdType, builder);
         return builder.buildFuture();
      }).orElseGet(() -> this.getCompletions(context));
   }

   @Override
   public synchronized CompletableFuture<Suggestions> getCompletions(CommandContext<?> context) {
      if (this.pendingCommandCompletion != null) {
         this.pendingCommandCompletion.cancel(false);
      }

      CompletableFuture completablefuture = new CompletableFuture();
      this.pendingCommandCompletion = completablefuture;
      int i = ++this.completionId;
      this.handler.sendPacket(new RequestCommandCompletionsC2SPacket(i, context.getInput()));
      return completablefuture;
   }

   @Override
   public Set<RegistryKey<World>> getWorldKeys() {
      return this.handler.getWorldKeys();
   }

   @Override
   public DynamicRegistryManager getRegistryManager() {
      return this.handler.getRegistryManager();
   }

   @Override
   public FeatureSet getEnabledFeatures() {
      return this.handler.getEnabledFeatures();
   }

   synchronized void onCommandSuggestions(int var1, Suggestions var2) {
      if (var1 == this.completionId && this.pendingCommandCompletion != null) {
         this.pendingCommandCompletion.complete(var2);
         this.pendingCommandCompletion = null;
         this.completionId = -1;
      }
   }

   synchronized void onChatSuggestions(Action var1, List<String> var2) {
      switch (var1) {
         case ADD:
            this.chatSuggestions.addAll(var2);
            break;
         case REMOVE:
            var2.forEach(this.chatSuggestions::remove);
            break;
         case SET:
            this.chatSuggestions.clear();
            this.chatSuggestions.addAll(var2);
      }
   }
}
