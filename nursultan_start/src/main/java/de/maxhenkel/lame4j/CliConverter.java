/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.lame4j;

import de.maxhenkel.lame4j.DecodedAudio;
import de.maxhenkel.lame4j.Mp3Decoder;
import de.maxhenkel.lame4j.Mp3Encoder;
import de.maxhenkel.lame4j.UnknownPlatformException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

public class CliConverter {
    public static void main(String[] stringArray) throws IOException, UnknownPlatformException {
        if (stringArray.length < 2) {
            System.out.println("Usage: java -jar lame4j.jar <input file> <output file>");
            return;
        }
        DecodedAudio decodedAudio = Mp3Decoder.decode(Files.newInputStream(Paths.get(stringArray[0], new String[0]), new OpenOption[0]));
        short[] sArray = decodedAudio.getSamples();
        System.out.println("Sample Rate: " + decodedAudio.getSampleRate());
        System.out.println("Bit Rate: " + decodedAudio.getBitRate());
        System.out.println("Channels: " + decodedAudio.getChannelCount());
        System.out.println("Frame Size: " + decodedAudio.getSampleSizeInBits());
        System.out.println("Length: " + sArray.length + " samples");
        System.out.println("Duration: " + (float)sArray.length / (float)decodedAudio.getSampleRate() + " seconds");
        Mp3Encoder mp3Encoder = new Mp3Encoder(decodedAudio.getChannelCount(), decodedAudio.getSampleRate(), decodedAudio.getBitRate(), 5, Files.newOutputStream(Paths.get(stringArray[1], new String[0]), new OpenOption[0]));
        mp3Encoder.write(sArray);
        mp3Encoder.close();
    }
}

