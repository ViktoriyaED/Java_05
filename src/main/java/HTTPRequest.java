public class HTTPRequest {

    String greekLondon = "Λονδίνο";
    String persianLondon = "لندن";
    String hindiLondon = "लंदन";
    String frenchLondon = "Londres";
    String englishLondon = "London";

    String cityName;

    String apiKey;

    public static String createRequest(String cityName, String apiKey) {

        String request = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apiKey;
        return request;
    }

    public static void main(String[] args) {
        String cityName = "Λονδίνο";
        String apiKey = "20cbbe5f82ae947874eb39f29f8ffbe1";
        System.out.println(createRequest(cityName, apiKey));

    }
}
