package portal.api.webflux.portalAPI.util.apiheader;

public class Forbidden implements ApiHeaderInterface {

	// 클라이언트에 요청 된 리소스에 액세스 할 수있는 권한이 없습니다.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(403);
		vo.setName("Forbidden");

		return vo;
	}
}
