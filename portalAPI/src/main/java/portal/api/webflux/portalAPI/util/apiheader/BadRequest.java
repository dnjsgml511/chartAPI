package portal.api.webflux.portalAPI.util.apiheader;

public class BadRequest implements ApiHeaderInterface {

	// ��û�� ��ȿ���� �ʽ��ϴ�.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(400);
		vo.setName("Bad Request");

		return vo;
	}

}
