package portal.api.webflux.portalAPI.util.apiheader;

public class Forbidden implements ApiHeaderInterface {

	// Ŭ���̾�Ʈ�� ��û �� ���ҽ��� �׼��� �� ���ִ� ������ �����ϴ�.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(403);
		vo.setName("Forbidden");

		return vo;
	}
}
