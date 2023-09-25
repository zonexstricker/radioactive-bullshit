package zonexstricker.radioactivebullshit.mixin;

import net.minecraft.core.entity.EntityLiving;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(EntityLiving.class)
public abstract class EntityLivingRadiationMixin {
    // Declare a unique field for your mod
    @Unique
    public int irradiated;

    // You can add getter and setter methods for the field if needed
    public int getIrradiated() {
        return irradiated;
    }

    public void setIrradiated(int irradiated) {
        this.irradiated = irradiated;
    }
}