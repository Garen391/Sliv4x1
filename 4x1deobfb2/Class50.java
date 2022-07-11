/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.RenderHandEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class50
extends Class17 {
    public static long lllllIlllIlIlllIlllllIllIllIIIllIIIIIlIllllIlIlIllIlIllllllIIIlIIIIIlIIlIIIIlIIIlIlIIIlIIllIIIIlIlIIlIIllIIlllIlIlIlllIllIlllIIIlIIlllIIIlIlllIllIIlllIlIllIlIlIlIIIlIlIIIIlIIllIlIIIIlllIIIlIIIIIlIIIll = 6633369434914519423L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    @SubscribeEvent
    public void lIIIIlIIllIlIllIIIIlIIlIIIIllIlllIlllllIIlllllIIIlIIIlIIIIIlIIIIllIllIlIIllllIIIIllIIIlIllIllIlIIllIlIIIlIlllIIlIlIIlIlIlIllIIIlIIIIlIlllIIIIllllIIlllIIIlIllIIIlIIIllIllIlIlIlIlllIIIIIllIlllllIIlIIlIl(RenderHandEvent renderHandEvent) {
        if (renderHandEvent.getSwingProgress() > 0.0f) {
            GL11.glRotatef((float)((1.0f - renderHandEvent.getSwingProgress()) * 360.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        }
    }

    public Class50() {
        super("SwingAnimations", 0, Class44.IllllIlIlllllIlIlllllIIlIlIllIIllllIIlIIllIllllIIIllIlIIIIIlIIlIIllIIllllIlllIllllllIllIIIIIIlIIllIllllIIIlIllIIlIllIlIlIlIlIlIIlIlllllIlIlIlllIllIlIlIllIIlIllIlIlIlIllIlIlllIIIIIIlllIIIlllIlIIIIlIIIl);
    }
}

