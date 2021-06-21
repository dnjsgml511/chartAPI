package portal.api.webflux.portalAPI.util.apiheader;

public class NotFound implements ApiHeaderInterface {

	// 요청한 리소스를 찾을 수 없습니다.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(404);
		vo.setName("Not Found");

		return vo;
	}

}
