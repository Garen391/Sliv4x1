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

public class Class9
extends Class17 {
    static long IlIIlIIllIIIIllllIlIlIlIlIlIIlIIlIllllIIlIIIIIlIllllIllIIlllIlllIlIllIIIIllIlIllIlllIIlIIlIIlIIlIIllIlIlIIIIIIlIllIlIIIIlIIlIlIIllIIIllllIIlIlIIIlIIllIIlIIIIlIIIlIIIIlllIIlllIlIllllllllIlllllIIlIlIIIl = -1945188711660082850L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    public Class9() {
        super("ViewModel", 0, Class44.IllllIlIlllllIlIlllllIIlIlIllIIllllIIlIIllIllllIIIllIlIIIIIlIIlIIllIIllllIlllIllllllIllIIIIIIlIIllIllllIIIlIllIIlIllIlIlIlIlIlIIlIlllllIlIlIlllIllIlIlIllIIlIllIlIlIlIllIlIlllIIIIIIlllIIIlllIlIIIIlIIIl);
    }

    @SubscribeEvent
    public void llIIIIIIIlIIIlllIIIIIllllIlIlllIlllIlIlIIIIlllIlIIIIIlIIIIIIllllIlllIlIlIIlllIIlllIlIIIIIIlIIlIIlIIIlIlIlIlIlIIIlllIIIlIIIIIllIIIlIIlllIlllIllIIllIlIIIIlIIIIIIIlIlllIlIllIlllIlIllIllIllIIIIlIlIIllllll(RenderHandEvent renderHandEvent) {
        GL11.glTranslated((double)0.0, (double)0.0, (double)-0.74);
    }
}

