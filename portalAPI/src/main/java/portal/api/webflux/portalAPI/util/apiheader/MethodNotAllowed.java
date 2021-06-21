package portal.api.webflux.portalAPI.util.apiheader;

public class MethodNotAllowed implements ApiHeaderInterface {

	// 요청의 HTTP 메서드가 리소스에서 지원되지 않습니다. 예를 들어 DELETE 메서드는 Agent API와 함께 사용할 수 없습니다.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(405);
		vo.setName("Method Not Allowed");

		return vo;
	}

}
