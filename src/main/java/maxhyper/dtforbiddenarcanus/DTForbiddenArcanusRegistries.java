package maxhyper.dtforbiddenarcanus;

import com.ferreusveritas.dynamictrees.api.registry.TypeRegistryEvent;
import com.ferreusveritas.dynamictrees.tree.family.Family;
import maxhyper.dtforbiddenarcanus.trees.MysterywoodFamily;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DynamicTreesForbiddenArcanus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTForbiddenArcanusRegistries {

    @SubscribeEvent
    public static void registerFamilyTypes(TypeRegistryEvent<Family> event) {
        event.registerType(new ResourceLocation(DynamicTreesForbiddenArcanus.MOD_ID, "mysterywood"), MysterywoodFamily.TYPE);
    }

}
