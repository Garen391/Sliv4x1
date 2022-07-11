/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

final class Class46
implements Runnable {
    public static long IIIlIlIIlIlIIlllllllllllIlllIIIIlIllllIlIIIlIIlllIIllIlllIlllllIIIlIllIIlllIIllllIIlllIllIIIIlIIlllllIlIllIllIIIIIIlIllIIllIllllIIlIllIIIlllIlIIlllIllllIIIlIIlIlIIllIlIlllIlIlIIlllIlIlIlIIllIIlIllIIIl = -3107521172495306671L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    @Override
    public void run() {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/home/admin/Downloads/cash.mp3"));
            clip.open(audioInputStream);
            clip.start();
            return;
        }
        catch (Exception exception) {
            System.err.println(exception.getMessage());
            return;
        }
    }

    Class46() {
    }
}

