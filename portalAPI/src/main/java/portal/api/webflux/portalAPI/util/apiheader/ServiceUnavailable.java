package portal.api.webflux.portalAPI.util.apiheader;

public class ServiceUnavailable implements ApiHeaderInterface {

	// ������ ����� �� �����ϴ�.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(503);
		vo.setName("Service Unavailable");

		return vo;
	}

}
