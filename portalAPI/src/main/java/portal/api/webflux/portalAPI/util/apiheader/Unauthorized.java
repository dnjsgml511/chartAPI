package portal.api.webflux.portalAPI.util.apiheader;

public class Unauthorized implements ApiHeaderInterface {

	// ��û�� ���� ��ū�� ���Ե��� �ʾҰų� ���� ��ū�� ����Ǿ����ϴ�.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(401);
		vo.setName("Unauthorized");

		return vo;
	}

}
