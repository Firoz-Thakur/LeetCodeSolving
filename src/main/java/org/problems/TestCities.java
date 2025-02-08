package org.problems;

import java.util.*;

public class TestCities {

    public static void main(String[] args) {

        getCities("USA");
    }
    public static void getCities(String state)
    {
        Map<String, List<String>> countryAndCityMap = new HashMap<>();
        countryAndCityMap.put("USA",Arrays.asList("Newyork","New Jersey"));
        countryAndCityMap.put("Indonesia",Arrays.asList("Jakarta","Bali"));
        countryAndCityMap.put("India",Arrays.asList("Delhi"));
        countryAndCityMap.put("bholu",new ArrayList<>());
        List<String > resultCities=new ArrayList<>();
        for(String key :  countryAndCityMap.keySet())
        {
            if(key.equals(state))
            {
                resultCities = countryAndCityMap.get(key);
            }
        }
        System.out.println("Cities for state "+ state +" is "+resultCities);
    }
}


