package portal.api.webflux.portalAPI.util.apiheader;

public class InternalServerError implements ApiHeaderInterface {

	// ���� ���� ���� ������ ���� ��û�� �Ϸ���� �ʾҽ��ϴ�.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(500);
		vo.setName("Internal ServerError");

		return vo;
	}

}
