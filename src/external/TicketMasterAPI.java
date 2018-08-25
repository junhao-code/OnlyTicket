package external;

import org.json.JSONArray;
import org.json.JSONObject;

public class TicketMasterAPI {
	private static final String API_HOST = "app.ticketmaster.com";
	private static final String SEARCH_PATH = "/discovery/v2/events.json";
	private static final String DEFAULT_TERM = "";  // no restriction
	private static final String API_KEY = "cDKFK1G1C2WpDQNidIXlItsg4KnsrYD0";
	
    public JSONArray search(double lat, double lon, String term) {

    }
    
    // in Java, we need to do url-encoding before adding it to the http request, 
    // similarly browser will do the same when we type in the address bar
    private String urlEncodeHelper(String term) {
		try {
			term = java.net.URLEncoder.encode(term, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return term;
	}
    // this is a print function to show JSON array returned from search() function
    private void queryAPI(double lat, double lon) {
		JSONArray events = search(lat, lon, null);
		try {
		    for (int i = 0; i < events.length(); i++) {
		        JSONObject event = events.getJSONObject(i);
		        System.out.println(event);
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
