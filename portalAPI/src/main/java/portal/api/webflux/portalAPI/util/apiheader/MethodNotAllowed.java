package portal.api.webflux.portalAPI.util.apiheader;

public class MethodNotAllowed implements ApiHeaderInterface {

	// ��û�� HTTP �޼��尡 ���ҽ����� �������� �ʽ��ϴ�. ���� ��� DELETE �޼���� Agent API�� �Բ� ����� �� �����ϴ�.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(405);
		vo.setName("Method Not Allowed");

		return vo;
	}

}
