/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.PlayerController
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraftforge.client.event.RenderPlayerEvent
 *  net.minecraftforge.event.TickEvent$PlayerTickEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerController;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Class20
extends Class17 {
    private static int IlIIlIIlIIIlIlIllllIlIlIIllIIllIlIllllIllIIlIlIlIIIIIIIIlllIlllIIllIIIlIIllIIIIIlIlIIlIIIIlIllIlllllIlIIlllIlIlIIIIlllIIIIlIllIlIIIlllIIllIlIlIlIIIIlllIIIlIIlIllIIIIIIllIlIIIllllIlIIIlIllIlIlIllIlIIlI;
    public static boolean llIlIIIllIIIlllIIllIIlllllIIlIlllIlIIllIllIlIIlIlIllllllIIlIllIlIIllIlllIllIllIllllIIlIlIlIllIlllIIlIlIllIllIIIlIllllIlIlIlIIIIIIllIIIIlllIllllllIIIlIlllllIIIllIlIlIIIIIIlllIIIlIIllllIllIIlIlIIIlIIIlI;
    private static long IlllIIIlllIlIIllIIIlIIlllllIIlIIIlIIlIIlllIIlIlIIIllIlIIlllIllIIllIlIllIIIlllllIllIIllIIIIIIIlllIIIIIIIlIIIlllIIIlIIlllIlIIllllIIllIIIlIlllIIIIIIlIlIlIIIIIllIIIIIIlllllIIIlllIlIlIIIIllIIIllIllllllIlIl = 3314857746948375347L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    public Class20() {
        super("TriggerBOT", 0, Class44.IlIllIllIIlIIlllllIIlIlllIlllIlIIllIIIIIIIIlIlIIIIIIlIlIIIllIllllIlIIlIllIIIlIIlIIlIlIIIlIIIlIlIIlIIlllIllIlllIlIlIIIIlIlllIIllIIIIIlIIllIlllllIlIlIIlIIlIlllIIlIllllIlllIlIIllllllIIlIlIlIllIIlIlIIIlII);
    }

    @SubscribeEvent
    public void lIIIIlIlllIlIIllIIlIllIllIllllIIllIIllIIllIlIIIIIIIlllIllllIllllIllIIllllIlIlIlIlIlllllllllllIIIllIIIIllIIlIIIlIlIIIllIlIIIllIlllllllIIlIIIlllIIlIlIllIIIlIIIlIIlIllIIIllllIIlIlIIllllIIIlIIIllIllIllIlI(TickEvent.PlayerTickEvent playerTickEvent) {
        RayTraceResult rayTraceResult = Minecraft.func_71410_x().field_71476_x;
        if (rayTraceResult != null) {
            if (rayTraceResult.func_216346_c() == RayTraceResult.Type.ENTITY) {
                IlIIlIIlIIIlIlIllllIlIlIIllIIllIlIllllIllIIlIlIlIIIIIIIIlllIlllIIllIIIlIIllIIIIIlIlIIlIIIIlIllIlllllIlIIlllIlIlIIIIlllIIIIlIllIlIIIlllIIllIlIlIlIIIIlllIIIlIIlIllIIIIIIllIlIIIllllIlIIIlIllIlIlIllIlIIlI = (int)rayTraceResult.func_216347_e().field_72450_a;
                llIlIIIllIIIlllIIllIIlllllIIlIlllIlIIllIllIlIIlIlIllllllIIlIllIlIIllIlllIllIllIllllIIlIlIlIllIlllIIlIlIllIllIIIlIllllIlIlIlIIIIIIllIIIIlllIllllllIIIlIlllllIIIllIlIlIIIIIIlllIIIlIIllllIllIIlIlIIIlIIIlI = true;
                return;
            }
            llIlIIIllIIIlllIIllIIlllllIIlIlllIlIIllIllIlIIlIlIllllllIIlIllIlIIllIlllIllIllIllllIIlIlIlIllIlllIIlIlIllIllIIIlIllllIlIlIlIIIIIIllIIIIlllIllllllIIIlIlllllIIIllIlIlIIIIIIlllIIIlIIllllIllIIlIlIIIlIIIlI = false;
            return;
        }
        llIlIIIllIIIlllIIllIIlllllIIlIlllIlIIllIllIlIIlIlIllllllIIlIllIlIIllIlllIllIllIllllIIlIlIlIllIlllIIlIlIllIllIIIlIllllIlIlIlIIIIIIllIIIIlllIllllllIIIlIlllllIIIllIlIlIIIIIIlllIIIlIIllllIllIIlIlIIIlIIIlI = false;
    }

    @SubscribeEvent
    public void llIIIlIIIlIIlIlIIIIIIIlIIIIlllIlllIllIIIlllllIlIlIIIllIIIIIlIlllIIIIlIIllIlIIIlIllIIIllIIlIllIIIIlIIIlIIIIIIIIlIIIlIIlllIllIlllIIlIIIllllIllIIIllIllllIlIllIlllIllIllIIIIlIIIIlllIIIlIlIIIIlIlIIlllllllI(RenderPlayerEvent renderPlayerEvent) {
        if (llIlIIIllIIIlllIIllIIlllllIIlIlllIlIIllIllIlIIlIlIllllllIIlIllIlIIllIlllIllIllIllllIIlIlIlIllIlllIIlIlIllIllIIIlIllllIlIlIlIIIIIIllIIIIlllIllllllIIIlIlllllIIIllIlIlIIIIIIlllIIIlIIllllIllIIlIlIIIlIIIlI && (int)renderPlayerEvent.getPlayer().func_226277_ct_() == IlIIlIIlIIIlIlIllllIlIlIIllIIllIlIllllIllIIlIlIlIIIIIIIIlllIlllIIllIIIlIIllIIIIIlIlIIlIIIIlIllIlllllIlIIlllIlIlIIIIlllIIIIlIllIlIIIlllIIllIlIlIlIIIIlllIIIlIIlIllIIIIIIllIlIIIllllIlIIIlIllIlIlIllIlIIlI) {
            assert (this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl.field_71439_g != null);
            if (this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl.field_71439_g.func_184825_o(0.0f) == 1.0f) {
                new PlayerController(this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl, this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl.field_71439_g.field_71174_a).func_78764_a((PlayerEntity)this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl.field_71439_g, (Entity)renderPlayerEvent.getPlayer());
                this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl.field_71439_g.func_184609_a(Hand.MAIN_HAND);
                this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl.field_71439_g.func_184821_cY();
            }
        }
    }
}

