package portal.api.webflux.portalAPI.util.apiheader;

public class InternalServerError implements ApiHeaderInterface {

	// 서버 측의 내부 오류로 인해 요청이 완료되지 않았습니다.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(500);
		vo.setName("Internal ServerError");

		return vo;
	}

}
