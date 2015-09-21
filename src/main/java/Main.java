import org.json.simple.JSONObject;
import static spark.Spark.*;

public class Main {

	public static void main(String[] args) {
		final JSONObject obj = new JSONObject();
		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		System.out.println(obj);
		
		
		get("/read", (req, res) -> obj);
	}
	
}
