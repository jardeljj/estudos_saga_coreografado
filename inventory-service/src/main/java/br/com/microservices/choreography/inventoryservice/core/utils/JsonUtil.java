package br.com.microservices.choreography.inventoryservice.core.utils;




import br.com.microservices.choreography.inventoryservice.core.dto.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class JsonUtil {

    private final ObjectMapper objectMapper;

    public String toJson(Object object){
        try {
            return objectMapper.writeValueAsString(object);
        } catch ( Exception ex){
            return "";
        }
    }

    public Event toEvent(String json){
        try {
            return objectMapper.readValue(json, Event.class);
        } catch ( Exception ex){
            return null;
        }
    }
}
