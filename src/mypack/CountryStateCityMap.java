package mypack;


import java.util.HashMap;

public class CountryStateCityMap {
    public static void main(String[] args) {
        // Creating the outer HashMap for Country -> (State -> (City))
        HashMap<String, HashMap<String, HashMap<String, String>>> countryMap = new HashMap<>();

        // Creating inner HashMaps for states and their cities
        HashMap<String, String> nyStateMap = new HashMap<>();
        nyStateMap.put("New York City", "New York");
        nyStateMap.put("Buffalo", "New York");

        HashMap<String, String> caStateMap = new HashMap<>();
        caStateMap.put("Los Angeles", "California");
        caStateMap.put("San Francisco", "California");

        // Mapping State -> City
        HashMap<String, HashMap<String, String>> usaMap = new HashMap<>();
        usaMap.put("New York", nyStateMap);
        usaMap.put("California", caStateMap);

        // Adding the USA map to the Country map
        countryMap.put("USA", usaMap);
        
        

        // Adding another country with its states and cities
        HashMap<String, String> dlStateMap = new HashMap<>();
        dlStateMap.put("New Delhi", "Delhi");
        dlStateMap.put("Gurgaon", "Haryana");

        HashMap<String, HashMap<String, String>> indiaMap = new HashMap<>();
        indiaMap.put("Delhi", dlStateMap);

        countryMap.put("India", indiaMap);

        // Accessing elements
      //  System.out.println("USA -> New York -> New York City: " + countryMap.get("USA").get("New York").get("New York City"));
      //  System.out.println("USA -> California -> Los Angeles: " + countryMap.get("USA").get("California").get("Los Angeles"));
      //  System.out.println("India -> Delhi -> New Delhi: " + countryMap.get("India").get("Delhi").get("New Delhi"));

        // Adding a new city to a state
        countryMap.get("India").get("Delhi").put("Faridabad", "Haryana");

       System.out.println("India -> Haryana -> Faridabad: " + countryMap.get("India").get("Delhi").get("Faridabad"));
        
        
        
        // Creating the outer HashMap for Country -> (State -> (City))
        HashMap<String, HashMap<String, HashMap<String, String>>> countryMap1 = new HashMap<>();
        
        
        // Creating inner HashMaps for states and their cities
        
        HashMap<String, String> stateMap = new HashMap<>();
        stateMap.put("Bihar","Patna");
        stateMap.put("Jharkhand","Ranchi");
        
        // Mapping State -> City
        
        HashMap<String, HashMap<String, String>>  stateCityMap = new HashMap<>();
        
        stateCityMap.put("Bihar",stateMap );
        countryMap1.put("India",stateCityMap);
        System.out.println("USA -> New York -> New York City: " + countryMap1.get("India").get("Bihar").get("Patna"));
        
        
        
    }
}


