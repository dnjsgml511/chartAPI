package portal.api.webflux.portalAPI.util.apiheader;

public class BadRequest implements ApiHeaderInterface {

	// 요청이 유효하지 않습니다.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(400);
		vo.setName("Bad Request");

		return vo;
	}

}
