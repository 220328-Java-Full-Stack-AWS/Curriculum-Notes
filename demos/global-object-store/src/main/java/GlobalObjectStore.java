import java.util.HashMap;
import java.util.Map;

public class GlobalObjectStore {
    private static Map<String, Object> globalStore;

    private GlobalObjectStore(){
        //private constructor - use getStore();
    }

    public static Map<String, Object> getStore() {
        if(globalStore == null) {
            globalStore = new HashMap<String, Object>();
        }

        return globalStore;
    }

    public static void add(String name, Object obj) {
        globalStore.put(name, obj);
    }

    public static Object getObject(String name) {
        return globalStore.get(name);
    }
}
