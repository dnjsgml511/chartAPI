package portal.api.webflux.portalAPI.util.apiheader;

public class Conflict implements ApiHeaderInterface {

	// �浹�� ���� ��û�� �Ϸ� �� �� �����ϴ�. ���� ���, ������ ���� �Ǵ� ���� �̸��� �̹� ���� ��ġ���ִ� ��� POST
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(409);
		vo.setName("Conflict");

		return vo;
	}
}
