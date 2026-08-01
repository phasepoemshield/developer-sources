package fun.nexisdlc.mixins.client;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.TextFactoryEvent;
import net.minecraft.text.TextVisitFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(TextVisitFactory.class)
public class TextVisitFactoryMixin {

    @ModifyVariable(
            method = "visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z",
            at = @At("HEAD"),
            ordinal = 0,
            argsOnly = true)
    private static String adjustText(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        TextFactoryEvent event = new TextFactoryEvent(text);
        NexisClient.getEventBus().post(event);
        return event.getText();
    }
}
