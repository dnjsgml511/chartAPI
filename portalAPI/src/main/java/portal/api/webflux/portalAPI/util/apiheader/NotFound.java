package portal.api.webflux.portalAPI.util.apiheader;

public class NotFound implements ApiHeaderInterface {

	// ��û�� ���ҽ��� ã�� �� �����ϴ�.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(404);
		vo.setName("Not Found");

		return vo;
	}

}
