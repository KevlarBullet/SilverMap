package me.silver.silvermap;

public class MapHandler {

    private static MapHandler instance = null;

    private boolean loaded = false;

    private MapHandler() {

    }

    public static MapHandler getInstance() {
        if (instance == null) {
            instance = new MapHandler();
        }

        return instance;
    }

    // On load get the current chunk and attempt to match it up with an existing chunk (hashes or whatever)
    // Note: Hashes may not be the most reliable if chunks were modified slightly
    public void load() {
        if (!this.loaded) {
            this.loaded = true;
        }
    }

    public void unload() {
        if (this.loaded) {
            this.loaded = false;
        }
    }

    public boolean isLoaded() {
        return loaded;
    }
}
