package portal.api.webflux.portalAPI.util.apiheader;

public class Created implements ApiHeaderInterface {

	// �� ���ҽ��� ���������� �����Ǿ����ϴ�.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(201);
		vo.setName("Created");

		return vo;
	}
}
