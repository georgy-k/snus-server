package com.example.snusserver.utilities;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author Crunchify.com
 */

public class Utils {

    @SuppressWarnings("unchecked")
    public static String allSnuss() throws IOException {

        JSONParser parser = new JSONParser();
        String data = "";

        try {

            Object obj = parser.parse(new FileReader(
                    "src/main/resources/static/snus_data.json"));


            JSONArray array = (JSONArray) obj;



            data = array.toJSONString();



           // JSONArray companyList = (JSONArray) jsonObject.get("Company List");

//            Iterator<String> iterator = companyList.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
