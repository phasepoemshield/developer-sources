package fun.wonderful.api.utils.render.fonts.ttf;

import java.awt.Font;
import java.io.InputStream;
import java.util.Optional;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.Resource;

public class FontUtil {
    public static Font getFontFromTTF(Identifier loc, float fontSize, int fontType) {
        try {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client == null) {
                return null;
            }
            if (client.getResourceManager() == null) {
                return null;
            }
            Optional resource = client.getResourceManager().getResource(loc);
            if (resource.isPresent()) {
                InputStream inputStream = ((Resource)resource.get()).getInputStream();
                Font output = Font.createFont(fontType, inputStream);
                output = output.deriveFont(fontSize);
                inputStream.close();
                return output;
            }
            return null;
        }
        catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}