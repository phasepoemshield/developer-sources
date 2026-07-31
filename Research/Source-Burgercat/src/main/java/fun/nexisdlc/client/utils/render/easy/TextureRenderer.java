package fun.nexisdlc.client.utils.render.easy;

import fun.nexisdlc.NexisClient;
import lombok.experimental.UtilityClass;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.joml.Vector4f;

import java.awt.Color;

@UtilityClass
public class TextureRenderer {
    public static void render(Identifier identifier, float x, float y, float width, float height, Color color) {
        render(identifier, x, y, width, height, 0.85f, null, color);
    }

    public static void render(Identifier identifier, float x, float y, float width, float height, Vector4f rounding, Color color) {
        render(identifier, x, y, width, height, 0.85f, rounding, color);
    }

    public static void render(Identifier identifier, float x, float y, float width, float height, float smooth, Vector4f rounding, Color color) {
        var renderer = NexisClient.getRenderer2D();
        if (renderer == null || identifier == null) {
            return;
        }
        float radius = rounding == null ? 0f : Math.max(Math.max(rounding.x, rounding.y), Math.max(rounding.z, rounding.w));
        renderer.drawTextureRounded(identifier, x, y, width, height, colorToRgba(color), radius);
    }

    public void render(Item item, float x, float y, float width, float height, float smooth, Vector4f round, Color color) {
        Identifier texture = getItemTextureId(new ItemStack(item));
        render(texture, x, y, width, height, smooth, round, color);
    }

    public void render(ItemStack stack, float x, float y, float width, float height, float smooth, Vector4f round, Color color) {
        Identifier texture = getItemTextureId(stack);
        render(texture, x, y, width, height, smooth, round, color);
    }

    public void render(Item item, float x, float y, float width, float height, float smooth, Vector4f round, Color color1, Color color2, Color color3, Color color4) {
        render(item, x, y, width, height, smooth, round, color1);
    }

    public Identifier getItemTextureId(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        Identifier itemId = Registries.ITEM.getId(stack.getItem());
        if (itemId == null) {
            return null;
        }
        String folder = stack.getItem() instanceof BlockItem ? "block" : "item";
        return Identifier.of(itemId.getNamespace(), "textures/" + folder + "/" + itemId.getPath() + ".png");
    }

    private static int colorToRgba(Color color) {
        if (color == null) {
            return 0xFFFFFFFF;
        }
        return ((color.getAlpha() & 0xFF) << 24)
                | ((color.getRed() & 0xFF) << 16)
                | ((color.getGreen() & 0xFF) << 8)
                | (color.getBlue() & 0xFF);
    }
}
