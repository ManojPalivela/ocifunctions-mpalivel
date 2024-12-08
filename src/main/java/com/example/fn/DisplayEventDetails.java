package com.example.fn;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class DisplayEventDetails {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Data{
        public String compartmentId;
        public String compartmentName;
        public String resourceName;
        public String resourceId;
        public String availabilityDomain;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Extensions{
        public String compartmentId;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Event{
        public String cloudEventsVersion;
        public String eventID;
        public String eventType;
        public String source;
        public String eventTypeVersion;
        public Date eventTime;
        public String contentType;
        public Extensions extensions;
        public Data data;
    }

    public String handleRequest(Event event) {

        System.out.println("source "+ event.source);
        System.out.println("eventType "+ event.eventType);
        System.out.println("compartmentId "+ event.data.compartmentId);
        System.out.println("compartmentName "+ event.data.compartmentName);
        System.out.println("resourceName "+ event.data.resourceName);
        System.out.println("resourceId "+ event.data.resourceId);

        return "success";
    }

}
