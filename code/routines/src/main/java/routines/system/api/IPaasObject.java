package routines.system.api;

import java.util.Map;

public interface IPaasObject {

    void put(Map<String, Object> map);

    void reject(Map<String, Object> map);

    Map<String, Object> take();
    
    void putDynamic(Map<IPaasField, Object> map);

    Map<IPaasField, Object> takeDynamic();

}
