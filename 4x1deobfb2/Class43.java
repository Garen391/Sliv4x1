/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.RenderGameOverlayEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 */
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Class43
extends Class17 {
    private static long lIlIIIlllllIlIlllIIllIllllIIllIlllIIlllIllllIIlIIllllIllIlIllllIIIIlIIlIlIIIlIIIIlllIlIIIlIIIIIIIllIIIlllIIlIIIIIlIIIllIIIIlllIIlIIllIIlllIIIlIIIlIIlIIllllIlllIlIIlIIIIlIIIIlIIIlIlIIlllllIIlllIllIllIl = 5816472136838749866L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    @SubscribeEvent
    public void IIllllIlIIIIlllllIIIIlllllIIlllIIIllIIIllllllllllIlIIIllllllIlIIIIllIIllllIllIlllIlllIlIlIIIIlIlIllllIIIIIllIllIIlIIlIlIllIIIlllIIIIIIIllIIlIIIlIllIIlIlIlIlIIIlIIIllllIIlIIllllIlIlllllllIlIlIllllllIll(RenderGameOverlayEvent renderGameOverlayEvent) {
        switch (renderGameOverlayEvent.getType()) {
            case DEBUG: {
                renderGameOverlayEvent.setCanceled(true);
            }
        }
    }

    public Class43() {
        super("Anti-Debug", 0, Class44.IlIlllIIlIllllIlIIllIlllIIIIIIIIlllIIlIlIlIlIlIllIlIIllllIIIlIIlllIIIlIIlIIIIllIlllIlIlIIlIlIIIllIIIIlIIIIIllIlIIllIllIlIIllIIlIllllllllIllllIllIIIllllIIIlIlIlIIIlIlIIIlllIlIlllIIllIIIIIIllIlllIlIIIII);
    }
}

