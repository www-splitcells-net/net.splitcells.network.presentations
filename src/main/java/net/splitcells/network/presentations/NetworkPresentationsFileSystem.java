package net.splitcells.network.presentations;

import net.splitcells.dem.environment.config.framework.OptionI;
import net.splitcells.dem.resource.FileSystemView;

import static net.splitcells.dem.resource.FileSystemViaClassResources.fileSystemViaClassResources;

public class NetworkPresentationsFileSystem extends OptionI<FileSystemView> {
    public NetworkPresentationsFileSystem() {
        super(() -> fileSystemViaClassResources(NetworkPresentationsFileSystem.class
                , "net.splitcells", "network.presentations"));
    }
}
