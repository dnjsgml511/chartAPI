package portal.api.webflux.portalAPI.util.apiheader;

public class Conflict implements ApiHeaderInterface {

	// 충돌로 인해 요청을 완료 할 수 없습니다. 예를 들어, 지정된 파일 또는 폴더 이름이 이미 상위 위치에있는 경우 POST
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(409);
		vo.setName("Conflict");

		return vo;
	}
}
