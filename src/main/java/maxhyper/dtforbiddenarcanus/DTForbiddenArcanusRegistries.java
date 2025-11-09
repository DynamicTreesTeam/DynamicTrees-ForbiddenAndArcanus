package maxhyper.dtforbiddenarcanus;

import com.dtteam.dynamictrees.event.TypeRegistryEvent;
import com.dtteam.dynamictrees.tree.family.Family;
import maxhyper.dtforbiddenarcanus.trees.AurumFamily;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class DTForbiddenArcanusRegistries {

    @SubscribeEvent
    public static void registerFamilyTypes(TypeRegistryEvent<Family> event) {
        event.registerType(ResourceLocation.fromNamespaceAndPath(DynamicTreesForbiddenArcanus.MOD_ID, "aurum"), AurumFamily.TYPE);
    }
}