package portal.api.webflux.portalAPI.util.apiheader;

public class Ok implements ApiHeaderInterface{
	
	// ��û�� ���������� �Ϸ�Ǿ����ϴ�.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(200);
		vo.setName("OK");
		return null;
	}
}
