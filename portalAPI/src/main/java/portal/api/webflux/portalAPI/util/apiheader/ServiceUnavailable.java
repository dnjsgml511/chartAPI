package portal.api.webflux.portalAPI.util.apiheader;

public class ServiceUnavailable implements ApiHeaderInterface {

	// 서버를 사용할 수 없습니다.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(503);
		vo.setName("Service Unavailable");

		return vo;
	}

}
