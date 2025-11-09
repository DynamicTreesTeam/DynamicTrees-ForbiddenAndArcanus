package maxhyper.dtforbiddenarcanus;

import com.dtteam.dynamictrees.data.GatherDataHelper;
import com.dtteam.dynamictrees.registry.NeoForgeRegistryHandler;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DynamicTreesForbiddenArcanus.MOD_ID)
public class DynamicTreesForbiddenArcanus {
    public static final String MOD_ID = "dtforbiddenarcanus";

    public DynamicTreesForbiddenArcanus(IEventBus bus, ModContainer modContainer) {
        bus.addListener(this::clientSetup);
        bus.addListener(this::gatherData);


        NeoForgeRegistryHandler.setup(MOD_ID, bus);
    }

    private void clientSetup(final FMLClientSetupEvent event) { }

    private void gatherData(final GatherDataEvent event) {
        GatherDataHelper.gatherTagData(MOD_ID, event);
        GatherDataHelper.gatherLootData(MOD_ID, event);
    }

}
