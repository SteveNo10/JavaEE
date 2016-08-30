import java.util.Base64;

public class Base64Demo {

	public static void main(String[] args) {
		String url = "http://172.26.223.49?returnurl=workflowStephandlers=";
		String param = "pendingid=2fd23da066f94d0bb474548afa3d6d11&username=hongjf";
		String afterParam = Base64.getEncoder().encodeToString(param.getBytes());
		url += afterParam;
		System.out.println(url);
	}

}
