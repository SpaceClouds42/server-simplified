package tech.dttp.serversimplified.mixin;

import net.minecraft.network.packet.s2c.play.PlayerListHeaderS2CPacket;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(PlayerListHeaderS2CPacket.class)
public interface MixinPlayerListHeaderS2C
{
    @Accessor("footer")
    void setFooter(Text footer);
}