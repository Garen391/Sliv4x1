/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SDisconnectPacket
 *  net.minecraftforge.client.event.RenderPlayerEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 */
import net.minecraft.network.play.server.SDisconnectPacket;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Class22
extends Class17 {
    public static long IIlIIlllIIIIlIIlIIlIIIIIlllllIllllllIIllIllllIIllIIIIlIIIIIllIlIIIIIIllIlIIlIlIllIlIlIIIlIlllIIlIIlllIIlIlllIIIIlllIlIIIIIlIlllIIllIIIlIllIIllIllIIIllIIIIIIlIlIIIlIIllllllIIIlIlIlIIIlIIIlIllIIllIIIIlI = 7477164262425769584L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    @SubscribeEvent
    public void lllIlIIlllllllIllIlllIIlIIIIIIIlIIllIlIIlIIIlllIlIlIlllllllIlllIlllllIlIIlllIlIlllIlIIIIIllIIIlIlIIIlIllIIIlIlIllIIIlIIIIllIlIlIllIlIlIlllIlIlIIlIlIIlllIIlIllIIIllIIIIllIlIIlllIllIIIIIIllIIIIlIllllllI(RenderPlayerEvent renderPlayerEvent) {
        if (this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl.field_71439_g.func_70032_d(renderPlayerEvent.getEntity()) <= 6.0f) {
            this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl.field_71439_g.field_71174_a.func_147253_a(new SDisconnectPacket());
        }
    }

    public Class22() {
        super("AutoLeave", 0, Class44.IlllIlllIIlllIIIIllIIIIlIlllIIIlIlIIlIlllIlIlIlllIIIlIllllIIIlllIlIlIIlllllllIllIllllllIIllIllIIIIIlllllIllllIllIIIIlllIlllIlIlllIllllllIlIIllllllIllllIlIIIllIlllllIIllIlIIllIIlIllIIIlIlllIllIlIllllII);
    }
}

