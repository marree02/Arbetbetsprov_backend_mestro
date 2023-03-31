import org.json.JSONArray;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PropertyAnalyzer {

    public static void main(String[] args) {
        ArrayList<String> propertyList = new ArrayList<>();
        propertyList.add("Adonis 2, Sveavägen 64, 113 51, Stockholm, Sverige, 2533, HV-HM-EL-A1");
        propertyList.add("Fatburssjön 10, Magnus Ladulåsgatan 65, 118 28, Stockholm, Sverige, 56213, HV-HM-EL1-ML65");
        propertyList.add("Grävlingen 12, Regeringsgatan 59, 111 56, Stockholm, Sverige, 51272, HV-HM-El-4054-A1");
        propertyList.add("Marievik 14, Årstaängsvägen 31, 117 43, Stockholm, Sverige, 19816, HV-HM-El-4052-ID7458");

//MeterName, Date, Usage, Unit.
        ArrayList<String> meterList = new ArrayList<>();
        meterList.add("HV-HM-EL-A1, 2021-01-01, 4 533.58, kWh");
        meterList.add("HV-HM-EL-A1, 2021-02-01, 4 420.31, kWh");
        meterList.add("HV-HM-EL-A1, 2021-03-01, 4 343.64, kWh");
        meterList.add("HV-HM-EL-A1, 2021-04-01, 3 602.47, kWh");
        meterList.add("HV-HM-EL-A1, 2021-05-01, 3 973.21, kWh");
        meterList.add("HV-HM-EL-A1, 2021-06-01, 3 601.15, kWh");
        meterList.add("HV-HM-EL-A1, 2021-07-01, 4 029.05, kWh");
        meterList.add("HV-HM-EL-A1, 2021-08-01, 3 991.16, kWh");
        meterList.add("HV-HM-EL-A1, 2021-09-01, 3 727.40, kWh");
        meterList.add("HV-HM-EL-A1, 2021-10-01, 4 037.57, kWh");
        meterList.add("HV-HM-EL-A1, 2021-11-01, 3 494.36, kWh");
        meterList.add("HV-HM-EL-A1, 2021-12-01, 3 242.22, kWh");

        meterList.add("HV-HM-EL1-ML65, 2021-01-01, 26 103.71, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-02-01, 21 814.40, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-03-01, 22 514.38, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-04-01, 21 269.47, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-05-01, 21 696.73, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-06-01, 21 408.92, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-07-01, 21 560.66, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-08-01, 22 144.56, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-09-01, 20 565.82, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-10-01, 21 904.80, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-11-01, 21 673.80, kWh");
        meterList.add("HV-HM-EL1-ML65, 2021-12-01, 21 430.54, kWh");

        meterList.add("HV-HM-El-4054-A1, 2021-01-01, 51 332.94, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-02-01, 47 240.20, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-03-01, 49 694.92, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-04-01, 44 181.64, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-05-01, 40 549.16, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-06-01, 38 286.18, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-07-01, 43 440.34, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-08-01, 42 284.54, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-09-01, 39 969.92, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-10-01, 44 315.36, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-11-01, 44 761.52, kWh");
        meterList.add("HV-HM-El-4054-A1, 2021-12-01, 44 009.16, kWh");

        meterList.add("HV-HM-El-4052-ID7458, 2021-01-01, 224 890.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-02-01, 194 476.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-03-01, 216 072.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-04-01, 136 496.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-05-01, 114 504.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-06-01, 94 598.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-07-01, 79 142.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-08-01, 97 464.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-09-01, 103 376.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-10-01, 114 400.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-11-01, 116 894.00, kWh");
        meterList.add("HV-HM-El-4052-ID7458, 2021-12-01, 109 014.00, kWh");

        List<Property> properties = new ArrayList<>();
        Map<String, Property> propertyMap = new HashMap<>();

        // Uppgift 1: Bygg ett JSON-objekt som innehåller fastighetsinformationen från "propertyList"
        // och mappa detta till den data som finns i "meterList". Logga ut JSON-objektet.
        for (String propertyString : propertyList) {
            String[] fields = propertyString.split(", ");
            Property property = new Property(fields[0], fields[1], fields[2], fields[3], fields[4], Double.parseDouble(fields[5]), fields[6]);
            properties.add(property);
            propertyMap.put(property.getMeterName(), property);
        }

        for (String meterString : meterList) {
            String[] fields = meterString.split(", ");
            String meterName = fields[0];
            Date date;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(fields[1]);
            } catch (ParseException e) {
                System.err.println("Invalid date format: " + fields[1]);
                continue;
            }
            double usage = Double.parseDouble(fields[2].replaceAll(" ", ""));
            String unit = fields[3];

            Property property = propertyMap.get(meterName);
            if (property != null) {
                property.addMeterReading(date, usage, unit);
            }
        }

        JSONArray jsonProperties = new JSONArray();
        for (Property property : properties) {
            jsonProperties.put(property.toJson());
        }
        System.out.println("JSON object: " + jsonProperties.toString(2));

        // Uppgift 2: Summera användningen årsvis för respektive fastighet.
        // Logga ut fastighetsnamn, totalanvändning samt enhet, med användningen i fallande ordning.
        properties.sort((p1, p2) -> Double.compare(p2.getTotalUsage(), p1.getTotalUsage()));
        System.out.println("Total usage per property:");
        for (Property property : properties) {
            System.out.printf("%s: %.2f %s%n", property.getName(), property.getTotalUsage(), property.getUnit());
        }

        // Uppgift 3: Dela varje fastighets användning med dess area, räkna ut medelvärdet för hela året.
        // Logga ut fastighetsnamn och medelvärdet på den ytfördelade användningen i stigande ordning.
        properties.sort((p1, p2) -> Double.compare(p1.getAverageUsagePerArea(), p2.getAverageUsagePerArea()));
        System.out.println("Average usage per area per property:");
        for (Property property : properties) {
            System.out.printf("%s: %.2f %s/m^2%n", property.getName(), property.getAverageUsagePerArea(), property.getUnit());
        }
    }
}

class Property {
    private final String name;
    private final String address;
    private final String postalCode;
    private final String city;
    private final String country;
    private final double area;
    private final String meterName;
    private final List<MeterReading> meterReadings;

    public Property(String name, String address, String postalCode, String city, String country, double area, String meterName) {
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.area = area;
        this.meterName = meterName;
        this.meterReadings = new ArrayList<>();
    }

    public void addMeterReading(Date date, double usage, String unit) {
        meterReadings.add(new MeterReading(date, usage, unit));
    }

    public String getName() {
        return name;
    }

    public String getMeterName() {
        return meterName;
    }

    public String getUnit() {
        return meterReadings.isEmpty() ? "" : meterReadings.get(0).getUnit();
    }

    public double getTotalUsage() {
        return meterReadings.stream().mapToDouble(MeterReading::getUsage).sum();
    }

    public double getAverageUsagePerArea() {
        return getTotalUsage() / area;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("address", address);
        json.put("postalCode", postalCode);
        json.put("city", city);
        json.put("country", country);
        json.put("area", area);
        json.put("meterName", meterName);
        JSONArray jsonMeterReadings = new JSONArray();
        for (MeterReading meterReading : meterReadings) {
            jsonMeterReadings.put(meterReading.toJson());
        }
        json.put("meterReadings", jsonMeterReadings);
        return json;
    }
}

class MeterReading {
    private final Date date;
    private final double usage;
    private final String unit;

    public MeterReading(Date date, double usage, String unit) {
        this.date = date;
        this.usage = usage;
        this.unit = unit;
    }

    public double getUsage() {
        return usage;
    }

    public String getUnit() {
        return unit;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("date", new SimpleDateFormat("yyyy-MM-dd").format(date));
        json.put("usage", usage);
        json.put("unit", unit);
        return json;
    }
}

