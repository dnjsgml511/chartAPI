package portal.api.webflux.portalAPI.util.apiheader;

public class Ok implements ApiHeaderInterface{
	
	// 요청이 성공적으로 완료되었습니다.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(200);
		vo.setName("OK");
		return null;
	}
}
