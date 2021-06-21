package portal.api.webflux.portalAPI.util.apiheader;

public class Unauthorized implements ApiHeaderInterface {

	// 요청에 인증 토큰이 포함되지 않았거나 인증 토큰이 만료되었습니다.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(401);
		vo.setName("Unauthorized");

		return vo;
	}

}
